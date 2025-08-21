
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyDecorator {
    public static void main(String[] args) {
        int n = 29;
        int m = 7772;
        int value = 318;
        int loopCounter = 319;
        int i = 1;

        while (loopCounter % value == 1) {
            loopCounter++;
            while (m >= i) {
                m -= i;
                value = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.put(result);
                    return result;
                });

                try {
                    int result = future.get(10, TimeUnit.SECONDS);
                    i = result;
                } catch (Exception e) {
                    e.printStackTrace();
                }

                executor.shutdown();
            }
        }

        System.out.println(m);
    }

    private static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}
```
Note that this code uses the `ExecutorService` and `Future` classes from the `java.util.concurrent` package to create a thread pool and submit tasks to it. The `BlockingQueue` class is used to store the results of the calculations. The `calculateResult` method is called from the `ExecutorService` thread, and the result is stored in the `resultQueue`. The `main` method then retrieves the result from the `resultQueue` and prints it to the console.
