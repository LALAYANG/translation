Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final long KEEP_ALIVE_TIME = 5000;

    private static ThreadPoolExecutor executor;
    private static BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.MILLISECONDS,
                workQueue);

        int check1 = 460;
        int check2 = 805;

        if ((check1 & check2) != 0) {
            int[] result = LI();
            int a = result[0];
            int b = result[1];

            if (a > 0) {
                System.out.println("Positive");
            } else if (a <= 0 && b >= 0) {
                System.out.println("Zero");
            } else if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }

        executor.shutdown();
    }

    public static int[] LI() throws InterruptedException {
        final int[] result = new int[2];
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                result[0] = scanner.nextInt();
                result[1] = scanner.nextInt();
            }
        };

        executor.execute(task);
        executor.awaitTermination(1, TimeUnit.MINUTES);

        return result;
    }
}
```

Please note that the Java code uses a `ThreadPoolExecutor` to manage the threading. The `LI` method reads the input from the console and stores it in an array. The `main` method then checks the conditions and prints the appropriate output.

