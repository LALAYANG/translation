
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateProduct {
    public static void main(String[] args) {
        int targetValue = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int q = Integer.parseInt(args[2]);

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(() -> {
            int calculationResult = calculateProduct(s, q);
            queue.put(calculationResult);
        });

        workerThread.start();
        workerThread.join();

        int resultCalculateProduct = queue.get();
        s = resultCalculateProduct;

        int operationCount = 0;
        while (s < targetValue) {
            queue.put(calculateProduct(s, q));
            operationCount++;
        }

        System.out.println(operationCount);
    }

    private static int calculateProduct(int s, int q) {
        return s * q;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create a thread and a blocking queue, and the `LinkedBlockingQueue` class to create a blocking queue. The `Thread` class is used to create a new thread, and the `Runnable` interface is used to define the code that will be executed by the thread. The `join()` method is used to wait for the thread to finish executing before continuing with the main thread. The `get()` method is used to retrieve the result from the blocking queue.
