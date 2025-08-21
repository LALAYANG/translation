```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num_operations = scanner.nextInt();
        int[] factor = {1};
        int variable_3_11 = 2;
        LinkedBlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            int result = calculate_product(n, variable_3_11, factor);
            result_queue.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_product0 = result_queue.poll();
        int[] b = new int[2 * n];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        for (int i = 0; i < num_operations; i++) {
            int row_index = scanner.nextInt();
            int c = scanner.nextInt();
            b[row_index - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 != 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < 2 * n; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    public static int calculate_product(int n, int variable_3_11, int[] factor) {
        return factor[0] * n * variable_3_11;
    }
}
```
