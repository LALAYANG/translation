
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CookieCalculator {
    public static void main(String[] args) throws Exception {
        int timeIncrement = 3;
        int b = 2;
        int t = 9;
        int cookie = 0;
        int time = timeIncrement;
        int outerLoopCounter = 222;
        int innerLoopCounter = 221;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (time <= t + 0.5) {
                BlockingQueue<Integer> queueCalculateCookie0 = new LinkedBlockingQueue<>();

                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> futureCalculateCookie0 = executorService.submit(() -> {
                    int result = calculateCookie(cookie, b);
                    queueCalculateCookie0.put(result);
                    return result;
                });
                executorService.shutdown();
                executorService.awaitTermination(1, TimeUnit.SECONDS);

                int resultCalculateCookie0 = queueCalculateCookie0.take();
                cookie = resultCalculateCookie0;
                time = time + timeIncrement;
            }
        }
        System.out.println(cookie);
    }

    private static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}
```
Note that this code uses the `ExecutorService` and `Future` classes from the Java Concurrency API to create a thread pool and submit tasks to it. The `BlockingQueue` class is used to communicate between the main thread and the worker threads. The `awaitTermination` method is used to wait for the worker threads to finish their tasks before the main thread continues.

Also, note that the `ttest_ind` function is not implemented in Java, so I have removed it from the code.
