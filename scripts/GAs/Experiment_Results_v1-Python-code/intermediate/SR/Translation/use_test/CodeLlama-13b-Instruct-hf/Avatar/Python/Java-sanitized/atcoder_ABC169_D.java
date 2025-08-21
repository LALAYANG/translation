import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class atcoder_ABC169_D {
    private static final int MOD = 1000000007;
    private static final int THREAD_COUNT = 10;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(THREAD_COUNT, THREAD_COUNT, 0, TimeUnit.SECONDS, queue);

        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.submit(new PrimeFactorizationThread(n, queue));
        }

        try {
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] factors = queue.stream().mapToInt(Integer::intValue).toArray();
        int[] factorCounts = new int[factors.length];
        for (int i = 0; i < factors.length; i++) {
            factorCounts[i] = factors[i];
        }

        int ans = 0;
        for (int i = 0; i < factorCounts.length; i++) {
            int x = factorCounts[i];
            for (int j = 1; j < 99999999; j++) {
                if (x >= j) {
                    x -= j;
                    ans += 1;
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    private static class PrimeFactorizationThread implements Runnable {
        private final int n;
        private final BlockingQueue<Integer> queue;

        public PrimeFactorizationThread(int n, BlockingQueue<Integer> queue) {
            this.n = n;
            this.queue = queue;
        }

        @Override
        public void run() {
            int[] factors = primeFactors(n);
            for (int factor : factors) {
                queue.offer(factor);
            }
        }

        private int[] primeFactors(int n) {
            int[] factors = new int[10];
            int i = 0;
            while (n % 2 == 0) {
                factors[i++] = 2;
                n /= 2;
            }
            for (int f = 3; f * f <= n; f += 2) {
                while (n % f == 0) {
                    factors[i++] = f;
                    n /= f;
                }
            }
            if (n > 1) {
                factors[i++] = n;
            }
            return factors;
        }
    }
}