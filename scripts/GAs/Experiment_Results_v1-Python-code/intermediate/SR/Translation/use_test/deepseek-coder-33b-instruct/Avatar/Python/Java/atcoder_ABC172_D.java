Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, workQueue);

        long positiveIntegerInput = readInput();
        long ans = 0;
        for (long i = 1; i <= positiveIntegerInput; i++) {
            ans += i * (positiveIntegerInput / i) * (positiveIntegerInput / i + 1) / 2;
        }
        System.out.println(ans);
        executor.shutdown();
    }

    private static long readInput() throws InterruptedException {
        BlockingQueue<Long> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> queue.add(scanner.nextLong()));
        thread.start();
        thread.join();
        return queue.poll();
    }
}
```

Please note that the Java code does not include the functionality of the `ttest_ind` function from the `scipy.stats` module, as it is not available in Java. Also, the `rs`, `ri`, `rs_`, and `ri_` functions are replaced with `readInput` method, which reads the input from the console.

