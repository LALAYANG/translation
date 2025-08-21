Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int h1 = Integer.parseInt(args[0].split(":")[0]);
        int minuend = Integer.parseInt(args[0].split(":")[1]);
        int variable_3_4 = 60;
        minuend += calculateInitialProduct(variable_3_4, h1);
        int multiplicand = Integer.parseInt(args[1].split(":")[0]);
        int m2 = Integer.parseInt(args[1].split(":")[1]);
        int multiplier = 60;
        m2 += calculateProduct(multiplier, multiplicand);
        BlockingQueue<Integer> queueCalculateDifference0 = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            try {
                queueCalculateDifference0.put(calculateDifference(m2, minuend));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        int resultCalculateDifference0 = queueCalculateDifference0.take();
        m2 = resultCalculateDifference0;
        int divisor = 1440;
        BlockingQueue<Integer> queueCalculateRemainder0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            try {
                queueCalculateRemainder0.put(calculateRemainder(m2, divisor));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        int resultCalculateRemainder0 = queueCalculateRemainder0.take();
        m2 = resultCalculateRemainder0;
        System.out.printf("%02d:%02d%n", m2 / 60, m2 % 60);
    }

    private static int calculateRemainder(int m2, int divisor) {
        return m2 % divisor;
    }

    private static int calculateDifference(int m2, int minuend) {
        return minuend - m2;
    }

    private static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    private static int calculateInitialProduct(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test, which is not available in Java. The equivalent functionality would need to be implemented manually or by using a library that provides this functionality.

