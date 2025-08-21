
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int limit_b = scanner.nextInt();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int rep = N / (A + limit_b);
            int ans = rep * A;
            int res = N - rep * (A + limit_b);
            ans += Math.min(res, A);
            return ans;
        });

        try {
            int result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
        } finally {
            executor.shutdown();
        }
    }
}
```
Note that this code uses the `ExecutorService` and `Future` classes from the Java Concurrency API to run the computation in a separate thread. The `Future` object is used to retrieve the result of the computation, and the `ExecutorService` is used to manage the thread. The `try-catch` block is used to handle any exceptions that may occur during the computation.
