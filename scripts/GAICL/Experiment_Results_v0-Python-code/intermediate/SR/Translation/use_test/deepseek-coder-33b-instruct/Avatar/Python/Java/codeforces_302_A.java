Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = scanner.next().replaceAll("[^-]", "").length();
        sa = Math.min(num_elements - sa, sa);
        List<String> ss = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(num_queries);
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            Callable<Integer> calculation = () -> calculate(value_a, b);
            Future<Integer> future = executorService.submit(calculation);
            b = future.get();
            ss.add((b % 2 != 0 && b <= sa << 1) ? "1\n" : "0\n");
        }
        executorService.shutdown();
        System.out.print(String.join("", ss));
    }

    private static int calculate(int value_a, int b) {
        return b - value_a;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `input()` function. Instead, we use `Scanner` to read input from the console. Also, Java does not have a direct equivalent to Python's `queue` module. Instead, we use `Future` and `ExecutorService` to handle threads and their results.

