```java
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int t, current_value, q, counter, divisor, ans = 0;
        String[] input = "12351 1223 6".split(" ");
        t = Integer.parseInt(input[0]);
        current_value = Integer.parseInt(input[1]);
        q = Integer.parseInt(input[2]);
        counter = 267;
        divisor = 266;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> queue_calculate_sum0 = new ConcurrentLinkedQueue<>();
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Runnable runnable = () -> {
                int result = calculate_sum(variable_3_10, counter);
                queue_calculate_sum0.offer(result);
            };
            executor.execute(runnable);
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum_result = queue_calculate_sum0.poll();
            counter = sum_result;
            while (current_value < t) {
                Queue<Integer> product_queue = new ConcurrentLinkedQueue<>();
                ExecutorService executor1 = Executors.newFixedThreadPool(1);
                Runnable runnable1 = () -> {
                    int result = calculate_product(current_value, q);
                    product_queue.offer(result);
                };
                executor1.execute(runnable1);
                executor1.shutdown();
                try {
                    executor1.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_calculate_product0 = product_queue.poll();
                current_value = result_calculate_product0;
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int calculate_product(int current_value, int q) {
        return current_value * q;
    }

    public static int calculate_sum(int variable_3_10, int counter) {
        Random random = new Random();
        int[] arr = {68, 41, 65};
        shuffle(arr, random);
        return counter + variable_3_10;
    }
}
```
