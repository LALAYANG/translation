import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_92_A {
    public static void main(String[] args) throws InterruptedException {
        int n, m;
        n = 29;
        m = 7772;
        int current_value = 1;
        while (m >= current_value) {
            LinkedBlockingQueue<Integer> queue_calculate_difference0 = new LinkedBlockingQueue<>();
            ExecutorService executor_calculate_difference0 = Executors.newSingleThreadExecutor();
            Runnable calculate_difference_thread = () -> {
                int difference_result = calculate_difference(current_value, m);
                queue_calculate_difference0.offer(difference_result);
            };
            executor_calculate_difference0.execute(calculate_difference_thread);
            executor_calculate_difference0.shutdown();
            executor_calculate_difference0.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            int result_calculate_difference0 = queue_calculate_difference0.take();
            m = result_calculate_difference0;
            int constant_one = 1;
            LinkedBlockingQueue<Integer> sum_modulo_queue = new LinkedBlockingQueue<>();
            ExecutorService executor_sum_modulo = Executors.newSingleThreadExecutor();
            Runnable calculate_sum_with_modulo_thread = () -> {
                int result = calculate_sum_with_modulo(current_value, constant_one, n);
                sum_modulo_queue.offer(result);
            };
            executor_sum_modulo.execute(calculate_sum_with_modulo_thread);
            executor_sum_modulo.shutdown();
            executor_sum_modulo.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            int sum_modulo_result = sum_modulo_queue.take();
            current_value = sum_modulo_result;
        }
        System.out.println(m);
    }

    public static int calculate_sum_with_modulo(int current_value, int constant_one, int n) {
        return (current_value % n + constant_one) % n;
    }

    public static int calculate_difference(int current_value, int m) {
        return m - current_value;
    }
}