import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_569_A {
    private static int calculateProduct(int s, int q) {
        return s * q;
    }

    public static void main(String[] args) throws InterruptedException {
        int target_value = 12351;
        int s = 1223;
        int q = 6;
        int operation_count = 0;
        int loop_counter_one = 608;
        int loop_counter_two = 607;

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);

        while (loop_counter_one % loop_counter_two == 1) {
            loop_counter_one += 1;
            while (s < target_value) {
                final int[] result_calculate_product0 = new int[1];
                executor.execute(() -> result_calculate_product0[0] = calculateProduct(s, q));
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                s = result_calculate_product0[0];
                operation_count += 1;
            }
        }
        System.out.println(operation_count);
    }
}