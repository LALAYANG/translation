```java
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DiffXThread {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        BlockingQueue<Integer> queueDiffX = new LinkedBlockingQueue<>();
        BlockingQueue<Integer> queueDiffY = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        executor.execute(() -> {
            int diffX = x2 - x1;
            queueDiffX.put(diffX);
        });

        executor.execute(() -> {
            int diffY = y2 - y1;
            queueDiffY.put(diffY);
        });

        int x3 = x2 - queueDiffY.take();
        int y3 = y2 + queueDiffX.take();
        int x4 = x1 - queueDiffY.take();
        int y4 = y1 + queueDiffX.take();

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```
Note: The above code uses Java 8's `BlockingQueue` and `ThreadPoolExecutor` to implement the multi-threading functionality. The `BlockingQueue` is used to store the results of the `diff_x` and `diff_y` functions, and the `ThreadPoolExecutor` is used to execute the two functions in parallel. The `take()` method is used to retrieve the results from the `BlockingQueue` and the `put()` method is used to store the results in the `BlockingQueue`.
