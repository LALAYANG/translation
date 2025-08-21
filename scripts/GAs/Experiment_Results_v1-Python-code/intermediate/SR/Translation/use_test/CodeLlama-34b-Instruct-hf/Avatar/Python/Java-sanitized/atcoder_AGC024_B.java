import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = Integer.parseInt(args[i + 1]);
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }

        int initialValue = 0;
        int multiplier = 1;
        ExecutorService executor = Executors.newFixedThreadPool(1);

        AtomicInteger result = new AtomicInteger(0);
        executor.submit(() -> {
            result.set(calculateResult(multiplier, initialValue, N));
        });

        try {
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int a = result.get();
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }

        int currentLength = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                currentLength++;
                maxLen = Math.max(maxLen, currentLength);
            } else {
                currentLength = 1;
            }
        }

        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateResult(int multiplier, int initialValue, int N) {
        return initialValue * (N + multiplier);
    }
}