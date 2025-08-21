```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < num_elements; i++) {
            if (scanner.nextInt() < 0) {
                sa++;
            }
        }
        sa = Math.min(num_elements - sa, sa << 1);
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(num_queries, num_queries, 1, TimeUnit.SECONDS, queue);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            executor.execute(() -> {
                int calculated_value = calculate(value_a, b);
                b = calculated_value;
                result.append((b % 2 != 0 && b <= sa << 1) ? "1\n" : "0\n");
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.print(result);
    }

    private static int calculate(int value_a, int b) {
        return subtract(b, value_a);
    }

    private static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}
```

