import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_579_A {
    private static int x = 1;
    private static int n = 117422204;

    public static void main(String[] args) throws InterruptedException {
        int outer_loop_counter = 250;
        int inner_loop_checker = 249;
        while (outer_loop_counter % inner_loop_checker == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (Math.log(n) / Math.log(2) % 1 != 0) {
                int increment = 1;
                BlockingQueue<Integer> sumQueue = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    try {
                        sumQueue.put(calculateSum(x, increment));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                x = sumQueue.take();
                n -= Math.pow(2, (int) (Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(x);
    }

    private static int calculateSum(int x, int increment) {
        return x + increment;
    }
}