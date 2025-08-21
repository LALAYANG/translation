Here is the Java version of the Python code:

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

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);

        int[] result = new int[1];
        executor.execute(() -> {
            result[0] = calculateLeastCommonMultiple(x, y);
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int lcm = result[0];
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int calculateLeastCommonMultiple(int a, int b) {
        return a * b / calculateGreatestCommonDivisor(a, b);
    }

    private static int calculateGreatestCommonDivisor(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter += 1;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. The equivalent functionality in Java would be to use a library like Apache Commons Math or JAMA, but this is not included in the Java version.

Also, the Python code uses the `queue` module to pass data between threads, which is not available in Java. Instead, a `BlockingQueue` is used to pass data between threads.

The Python code uses the `threading` module to create and manage threads, which is not available in Java. Instead, a `ThreadPoolExecutor` is used to create and manage threads.

The Python code uses the `input().split(' ')` function to read input from the user, which is not available in Java. Instead, a `Scanner` is used to read input from the user.

The Python code uses the `print` function to output the result, which is not available in Java. Instead, the `System.out.println` method is used to output the result.

