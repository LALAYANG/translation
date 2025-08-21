Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int i = 1, j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = calculateSum(incrementValue, sumValue);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int sumResult = resultQueue.take();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
    }

    private static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. You would need to implement this functionality yourself or find a suitable library in Java.

Also, please note that the Java code uses a `ThreadPoolExecutor` to manage the addition thread. This is because Java does not have a direct equivalent to Python's `threading.Thread`. The `ThreadPoolExecutor` is a more flexible and powerful way to manage threads in Java.

Finally, the Java code uses a `BlockingQueue` to pass the result of the addition thread back to the main thread. This is because Java does not have a direct equivalent to Python's `queue.Queue`. The `BlockingQueue` is a more flexible and powerful way to pass data between threads in Java.

