
Here's the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() -> calculateValue(P, N));
        int result = future.get();
        System.out.println(result);

        executor.shutdown();
    }

    private static int calculateValue(int[] P, int N) {
        int base = 0;
        int offset = 1;
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += base * (N + offset);
            base = P[i];
            offset = i + 1;
        }
        return result;
    }
}
```
Note that the Java code uses an `ExecutorService` to execute the `calculateValue` method in a separate thread, and then waits for the result using the `Future` object. This is similar to the Python code, which uses a `threading.Thread` object to execute the `calculate_value` function in a separate thread, and then waits for the result using the `queue.Queue` object.
