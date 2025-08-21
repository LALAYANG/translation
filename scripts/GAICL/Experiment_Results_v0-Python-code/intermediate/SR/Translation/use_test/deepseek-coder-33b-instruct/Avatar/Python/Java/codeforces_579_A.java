Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = 117422204;
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;

        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = addNumbers(variable_3_9, loop_counter);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            loop_counter = resultQueue.take();

            while (Math.log(n) % 1 != 0) {
                x = x + 1;
                n -= Math.pow(2, (int) Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(x);
    }

    public static int addNumbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}
```

Please note that the Python code uses `scipy.stats.ttest_ind` and `math.log2` which are not available in Java. I have replaced them with `Math.log` and `Math.pow` respectively. Also, the Python code uses `queue.Queue` which is not available in Java. I have replaced it with `BlockingQueue`.

