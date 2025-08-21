import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC125_C {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(new RuisekiLR0(num_a));
        int[] result_ruiseki_lr0 = future.get();
        executor.shutdown();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(result_ruiseki_lr0[0][i], result_ruiseki_lr0[1][i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static class RuisekiLR0 implements Callable<int[][]> {
        private final int[] num_a;

        public RuisekiLR0(int[] num_a) {
            this.num_a = num_a;
        }

        @Override
        public int[][] call() {
            int n = num_a.length;
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            for (int i = 0; i < n; i++) {
                left[i + 1] = gcd(left[i], num_a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], num_a[i]);
            }
            return new int[][]{left, right};
        }
    }
}