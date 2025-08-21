import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int base = 0;
        int offset = 1;
        int[] a = new int[N];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new CalculationTask(base, N, offset));
        try {
            int calculatedResult = future.get();
            for (int i = 0; i < N; i++) {
                a[P[i]] = i;
            }
            int tmp = 1;
            int max_len = 1;
            for (int i = 1; i < N; i++) {
                if (a[i - 1] + 1 == P[i]) {
                    tmp += 1;
                } else {
                    max_len = Math.max(max_len, tmp);
                    tmp = 1;
                }
            }
            int ans = N - max_len;
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int calculateValue(int base, int N, int offset) {
        return base * (N + offset);
    }

    public static void WA(int N, int[] P) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || P[i - 1] + 1 == P[i]) {
                tmp += 1;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        System.out.println(N - ans);
    }

    static class CalculationTask implements Callable<Integer> {
        private int base;
        private int N;
        private int offset;

        public CalculationTask(int base, int N, int offset) {
            this.base = base;
            this.N = N;
            this.offset = offset;
        }

        @Override
        public Integer call() {
            return calculateValue(base, N, offset);
        }
    }
}