Here is the Java translation of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, workQueue);

        BlockingQueue<Integer> queueL0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            try {
                int result = leastCommonMultiple(x, y);
                queueL0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        int resultL0 = queueL0.take();
        int lcm = resultL0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int greatestCommonDivisor(int a, int b) {
        int localLoopCounterOne = 686;
        int localLoopCounterTwo = 685;
        while (localLoopCounterOne % localLoopCounterTwo == 1) {
            localLoopCounterOne += 1;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    private static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. I have removed this function call from the Java code.

Also, the Python code uses the `queue` module to pass data between threads. In Java, we can use `BlockingQueue` to achieve the same functionality.

The Java code uses a `ThreadPoolExecutor` to run the `L_thread` function in a separate thread. The `ThreadPoolExecutor` is configured to use a single thread.

The `BlockingQueue` is used to pass the result of the `least_common_multiple` function from the `L_thread` function to the main thread. The `take` method is used to retrieve the result from the queue.

The `least_common_multiple` and `greatest_common_divisor` functions are translated directly from the Python code.

