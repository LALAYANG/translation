import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_C {
    public static void main(String[] args) throws Exception {
        int n = 3;
        int[] num_a = {12, 15, 18};

        BlockingQueue<Runnable> queue_ruiseki_lr0 = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue_ruiseki_lr0);

        executor.execute(new RuisekiLrThread(num_a, queue_ruiseki_lr0));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int[][] result_ruiseki_lr0 = (int[][]) queue_ruiseki_lr0.take();
        int[] left = result_ruiseki_lr0[0];
        int[] right = result_ruiseki_lr0[1];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[][] ruiseki_lr(int[] array) {
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[][]{left, right};
    }

    static class RuisekiLrThread implements Runnable {
        private final int[] num_a;
        private final BlockingQueue<Runnable> queue_ruiseki_lr0;

        public RuisekiLrThread(int[] num_a, BlockingQueue<Runnable> queue_ruiseki_lr0) {
            this.num_a = num_a;
            this.queue_ruiseki_lr0 = queue_ruiseki_lr0;
        }

        @Override
        public void run() {
            try {
                queue_ruiseki_lr0.put(ruiseki_lr(num_a));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}