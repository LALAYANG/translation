```java
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculate {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = Double.parseDouble(args[i + 1]);
        }
        Arrays.sort(fractionalParts);
        int multiplier = 2;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);
        executor.execute(() -> {
            int result = calculate(n, fractionalParts.length, multiplier, fractionalParts);
            queue.put(result);
        });
        executor.shutdown();
        try {
            int result = queue.take();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int calculate(int n, int len, int multiplier, double[] fractionalParts) {
        return multiplier * n - len;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `ThreadPoolExecutor` to execute the `calculate` method in a separate thread, and then uses a `BlockingQueue` to retrieve the result from the thread. The `calculate` method is implemented as a static method in the `Calculate` class.
