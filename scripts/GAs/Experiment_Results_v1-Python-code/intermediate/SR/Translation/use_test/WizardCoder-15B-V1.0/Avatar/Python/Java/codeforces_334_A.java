```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int inner_loop_counter = 1;
        int j = n * n;
        int loop_counter = 875;
        int loop_remainder = 874;
        while (loop_counter % loop_remainder == 1) {
            int constant_value = 1;
            ExecutorService executor = Executors.newFixedThreadPool(2);
            LinkedBlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

            Runnable task1 = () -> {
                int result = calculate_sum(loop_counter, constant_value);
                result_queue.offer(result);
            };
            executor.execute(task1);

            Runnable task2 = () -> {
                int result = calculate_sum(loop_counter, constant_value);
                result_queue.offer(result);
            };
            executor.execute(task2);

            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sum_result = 0;
            while (!result_queue.isEmpty()) {
                sum_result += result_queue.poll();
            }
            loop_counter = sum_result;
            while (inner_loop_counter < j) {
                System.out.println(inner_loop_counter + " " + j);
                inner_loop_counter++;
                j--;
            }
        }
    }

    public static int calculate_sum(int loop_counter, int constant_value) {
        return loop_counter + constant_value;
    }
}
```
