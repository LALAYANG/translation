Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);

        int[] resultLI0 = new int[4];
        executor.execute(() -> {
            for (int i = 0; i < 4; i++) {
                resultLI0[i] = sc.nextInt();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int a = resultLI0[0];
        int b = resultLI0[1];
        int c = resultLI0[2];
        int d = resultLI0[3];

        int max = Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c));
        System.out.println(max);
    }
}
```

Please note that the Java code does not use the `ttest_ind` function from the `scipy.stats` module, as there is no direct equivalent in Java. The `ttest_ind` function is used to perform an independent t-test on two samples of scores, which is not applicable in this context.

