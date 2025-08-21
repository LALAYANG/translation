```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int target_value = 12351;
        int s = 1223;
        int q = 6;
        int operation_count = 0;
        int loop_counter_one = 608;
        int loop_counter_two = 607;
        while (loop_counter_one % loop_counter_two == 1) {
            loop_counter_one++;
            while (s < target_value) {
                Queue<Integer> queue_calculate_product0 = new LinkedList<>();

                class CalculateProductThread extends Thread {
                    public void run() {
                        int calculation_result = calculate_product(s, q);
                        queue_calculate_product0.offer(calculation_result);
                    }
                }
                CalculateProductThread worker_thread = new CalculateProductThread();
                worker_thread.start();
                try {
                    worker_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_calculate_product0 = queue_calculate_product0.poll();
                s = result_calculate_product0;
                operation_count++;
            }
        }
        System.out.println(operation_count);
    }

    public static int calculate_product(int s, int q) {
        return s * q;
    }
}
```
