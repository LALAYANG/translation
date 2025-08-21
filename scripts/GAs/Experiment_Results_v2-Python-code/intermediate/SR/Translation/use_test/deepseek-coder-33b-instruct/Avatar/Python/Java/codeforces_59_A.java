Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int cl = 0;
    private static int cu = 0;
    private static int lowercaseFlag = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int outerLoopBound = 128;
        int innerLoopBound = 127;
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);

        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (char z : txt.toCharArray()) {
                if (Character.isLowerCase(z)) {
                    lowercaseFlag = 1;
                    executor.execute(() -> cl = calculateResult(cl, lowercaseFlag));
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } else {
                    cu = cu + 1;
                }
            }
        }

        String finalOutput;
        if (cu > cl) {
            finalOutput = txt.toUpperCase();
        } else {
            finalOutput = txt.toLowerCase();
        }
        System.out.println(finalOutput);
    }

    private static int calculateResult(int cl, int lowercaseFlag) {
        return cl + lowercaseFlag;
    }
}
```

Please note that the Java version of the code uses a `ThreadPoolExecutor` to manage the threads. The `calculateResult` method is also slightly different because Java does not have a built-in function to calculate the t-test for independent samples.

