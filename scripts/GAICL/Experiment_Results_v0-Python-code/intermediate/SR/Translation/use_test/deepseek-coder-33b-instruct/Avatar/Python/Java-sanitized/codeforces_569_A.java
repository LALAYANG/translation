import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class codeforces_569_A {
    public static void main(String[] args) throws InterruptedException {
        int t = 12351, current_value = 1223, q = 6, ans = 0;
        int counter = 267, divisor = 266;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            BlockingQueue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();
            Thread thread_calculate_sum0 = new Thread(() -> {
                int result = calculateSum(variable_3_10, counter);
                try {
                    queue_calculate_sum0.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread_calculate_sum0.start();
            thread_calculate_sum0.join();
            int sum_result = queue_calculate_sum0.take();
            counter = sum_result;
            while (current_value < t) {
                BlockingQueue<Integer> product_queue = new LinkedBlockingQueue<>();
                Thread thread_calculate_product0 = new Thread(() -> {
                    int result = calculateProduct(current_value, q);
                    try {
                        product_queue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread_calculate_product0.start();
                thread_calculate_product0.join();
                int result_calculate_product0 = product_queue.take();
                current_value = result_calculate_product0;
                ans = ans + 1;
            }
        }
        System.out.println(ans);
    }

    public static int calculateSum(int variable_3_10, int counter) {
        return counter + variable_3_10;
    }

    public static int calculateProduct(int current_value, int q) {
        return current_value * q;
    }
}