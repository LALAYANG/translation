Here is the Java equivalent of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int calculateSum(int loopCounter, int constantValue) {
        return loopCounter + constantValue;
    }

    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int loopCounter = 875;
        int loopRemainder = 874;
        int innerLoopCounter = 1;
        int j = n * n;

        while (loopCounter % loopRemainder == 1) {
            int constantValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                try {
                    int result = calculateSum(loopCounter, constantValue);
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            int sumResult = resultQueue.take();
            loopCounter = sumResult;

            while (innerLoopCounter < j) {
                System.out.println(innerLoopCounter + " " + j);
                innerLoopCounter = innerLoopCounter + 1;
                j = j - 1;
            }
        }
    }
}
```

Please note that the Java code does not include the t-test calculation as it's not clear how to translate it from Python to Java. Also, the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. If you need to perform a t-test in Java, you can use the Apache Commons Math library.

