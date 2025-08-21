Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = 29;
        int m = 7772;
        int i = 1;
        int loopCounter = 319;
        int constantValue = 318;

        while (loopCounter % constantValue == 1) {
            loopCounter = loopCounter + 1;
            while (m >= i) {
                m -= i;
                int value = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    int result = calculateResult(i, n, value);
                    try {
                        resultQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                int result = resultQueue.take();
                i = result;
            }
        }
        System.out.println(m);
    }

    private static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` functions, which are not available in Java. These functions are used for statistical analysis and data shuffling respectively, and their Java equivalents are not straightforward. Therefore, they are not included in the Java code.

