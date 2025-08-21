Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
        int i = 1;
        int currentValue = 849;
        int divisor = 848;
        while (currentValue % divisor == 1) {
            int operand = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = sumOperands(operand, currentValue);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int sumResult = resultQueue.take();
            currentValue = sumResult;
            while (remainder >= i) {
                remainder = remainder - i;
                i = i % n + 1;
            }
        }
        System.out.println(remainder);
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to manage the thread. The `BlockingQueue` is used to pass the result from the worker thread back to the main thread. The `ThreadPoolExecutor` is shut down and the main thread waits for the worker thread to finish using `awaitTermination`. The `take` method is used to retrieve the result from the `BlockingQueue`.

Also, please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to perform a t-test in Java, you would need to implement it yourself or find a library that provides this functionality.

