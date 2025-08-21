Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);

        int[] resultLI0 = new int[4];
        executor.execute(() -> {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                resultLI0[i] = scanner.nextInt();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int a = resultLI0[0];
        int b = resultLI0[1];
        int multiplier = resultLI0[2];
        int d = resultLI0[3];

        int[] arr = {a * multiplier, b * d, a * d, b * multiplier};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. Also, the Python code uses the `sys.stdin.readline()` function, which is not available in Java. The Java code uses the `Scanner` class to read input from the console.

