```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int t = 12351;
        int current_value = 1223;
        int q = 6;
        int ans = 0;
        int counter = 267;
        int divisor = 266;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();
            Thread thread_calculate_sum0 = new Thread(() -> {
                int result = calculate_sum(variable_3_10, counter);
                queue_calculate_sum0.add(result);
            });
            thread_calculate_sum0.start();
            thread_calculate_sum0.join();
            int sum_result = queue_calculate_sum0.poll();
            counter = sum_result;
            while (current_value < t) {
                Queue<Integer> product_queue = new LinkedBlockingQueue<>();
                Thread thread_calculate_product0 = new Thread(() -> {
                    int result = calculate_product(current_value, q);
                    product_queue.add(result);
                });
                thread_calculate_product0.start();
                thread_calculate_product0.join();
                int result_calculate_product0 = product_queue.poll();
                current_value = result_calculate_product0;
                ans = ans + 1;
            }
        }
        System.out.println(ans);
    }

    public static int calculate_product(int current_value, int q) {
        return current_value * q;
    }

    public static int calculate_sum(int variable_3_10, int counter) {
        return counter + variable_3_10;
    }
}
```

