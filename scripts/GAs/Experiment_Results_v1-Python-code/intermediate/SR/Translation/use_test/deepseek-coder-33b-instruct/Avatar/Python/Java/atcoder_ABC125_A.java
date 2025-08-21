Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int cookie = 0;
    private static double currentTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double t = scanner.nextDouble();
        currentTime = a;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        while (currentTime <= t + 0.5) {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            executor.execute(() -> {
                int result = calculateCookie(cookie, b);
                queue.add(result);
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            cookie = queue.poll();
            currentTime = currentTime + a;
        }

        System.out.println(cookie);
    }

    private static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}
```

Please note that the Java code uses a `ThreadPoolExecutor` to manage the threading, which is a more modern and flexible approach than the Python `threading` module. The `BlockingQueue` is used to pass the result of the calculation back to the main thread. The `ThreadPoolExecutor` is shut down and awaited for termination after each calculation to ensure that the program does not continue before the calculation is complete.

Also, the `ttest_ind` and `shuffle` functions from the `scipy.stats` and `sklearn.utils` modules are not included in the Java version, as they are not used in the provided Python code.

