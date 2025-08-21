```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int ans = 0;
            for (int currentNumber = 1; currentNumber <= N; currentNumber++) {
                ans += currentNumber * (N / currentNumber) * (N / currentNumber + 1) / 2;
            }
            return ans;
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
```
Note: In Java, we use the `ExecutorService` and `Future` classes to implement the asynchronous behavior. The `ExecutorService` is used to create a thread pool with a single thread, and the `Future` is used to submit the task to the thread pool and retrieve the result. The `Future` class provides a `get()` method that blocks until the result is available.
