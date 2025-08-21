```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] data = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            data[i] = scanner.nextInt();
        }
        int[] variable_1_7 = new int[1];
        variable_1_7[0] = 0;
        Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> wrapped_func(array_size, variable_1_7));
        result_queue.add(future.get());
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        int global_result = result_queue.poll();
        int[] ans = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            ans[i] = global_result;
        }
        int current_max = data[array_size - 1];
        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int wrapped_func(int array_size, int[] variable_1_7) {
        return variable_1_7[0] * array_size;
    }
}
```

