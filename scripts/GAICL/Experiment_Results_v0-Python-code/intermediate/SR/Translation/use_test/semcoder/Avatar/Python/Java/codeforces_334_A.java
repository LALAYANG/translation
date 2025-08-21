```java
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static int calculateSum(int variable_3_11, int current_value) {
        return current_value + variable_3_11;
    }

    public static void main(String[] args) {
        int n = 4;
        int current_value = 1;
        int j = n * n;

        ExecutorService executor = Executors.newSingleThreadExecutor();

        while (current_value < j) {
            System.out.println(current_value + " " + j);
            int variable_3_11 = 1;
            Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();

            Runnable sum_worker = () -> {
                int result = calculateSum(variable_3_11, current_value);
                result_queue.add(result);
            };

            executor.submit(sum_worker);
            int sum_result = result_queue.poll();
            current_value = sum_result;
            j--;
        }

        executor.shutdown();
    }
}
```
