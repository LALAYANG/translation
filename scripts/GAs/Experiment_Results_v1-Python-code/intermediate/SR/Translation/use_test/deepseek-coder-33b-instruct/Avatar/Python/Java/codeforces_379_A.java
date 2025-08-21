Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int whole_candles = 3;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;
        int current_value = 637;
        int loop_bound = 636;

        while (current_value % loop_bound == 1) {
            int increment = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int sumResult = calculateSum(current_value, increment);
                try {
                    resultQueue.put(sumResult);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            int calculatedValue = resultQueue.take();
            current_value = calculatedValue;

            while (whole_candles > 0 || restoSciolte >= b) {
                whole_candles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += whole_candles;
                restoSciolte += whole_candles % b;
                whole_candles /= b;
            }
        }

        System.out.println(s);
    }

    private static int calculateSum(int current_value, int increment) {
        return current_value + increment;
    }
}
```

Please note that the Java version of the code uses a `ThreadPoolExecutor` to manage the thread. The `ThreadPoolExecutor` is a more flexible and powerful tool for managing threads than the `Thread` class. It allows for more control over the number of threads, their lifecycle, and their execution order.

Also, the Java version uses a `BlockingQueue` to pass the result of the calculation from the thread to the main thread. The `BlockingQueue` is a thread-safe data structure that allows for safe and efficient communication between threads.

Finally, the Java version uses the `ThreadPoolExecutor.awaitTermination` method to wait for the thread to finish its execution before continuing with the rest of the code. This is necessary because the main thread needs to wait for the calculation thread to finish before it can safely access the result from the queue.

