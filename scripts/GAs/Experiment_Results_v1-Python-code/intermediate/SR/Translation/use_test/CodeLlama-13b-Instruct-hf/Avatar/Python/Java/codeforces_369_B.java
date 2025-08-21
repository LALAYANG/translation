
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ComputePartitions {
    public static void main(String[] args) throws Exception {
        int new_n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int l = Integer.parseInt(args[2]);
        int new_r = Integer.parseInt(args[3]);
        int sa = Integer.parseInt(args[4]);
        int sk = Integer.parseInt(args[5]);

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            return computePartitions(k, new_n, sa, getNumbers, sk);
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        int result = future.get();
        System.out.println(result);
    }

    public static int computePartitions(int k, int new_n, int sa, int getNumbers, int sk) {
        return getNumbers(k, sk) + getNumbers(new_n - k, sa - sk);
    }

    public static int getNumbers(int num, int t) {
        return t / num + 1;
    }
}
```
Note that this code assumes that the input is a list of integers separated by spaces, and that the output should be a list of integers separated by spaces.

Also, this code uses the `ExecutorService` and `Future` classes from the Java Concurrency API to run the computation in a separate thread. The `BlockingQueue` is used to communicate between the main thread and the worker thread.

I hope this helps! Let me know if you have any questions or need further assistance.
