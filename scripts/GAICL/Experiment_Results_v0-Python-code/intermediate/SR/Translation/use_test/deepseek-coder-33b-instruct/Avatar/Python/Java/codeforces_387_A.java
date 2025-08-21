Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");
        String[] input2 = scanner.nextLine().split(":");

        int h1 = Integer.parseInt(input1[0]);
        int minuend = Integer.parseInt(input1[1]);
        int variable_3_4 = 60;
        minuend += calculateInitialProduct(variable_3_4, h1);

        int multiplicand = Integer.parseInt(input2[0]);
        int m2 = Integer.parseInt(input2[1]);
        int multiplier = 60;
        m2 += calculateProduct(multiplier, multiplicand);

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            try {
                queue.put(calculateDifference(m2, minuend));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        m2 = queue.take();

        int divisor = 1440;
        executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            try {
                queue.put(calculateRemainder(m2, divisor));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        m2 = queue.take();

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

Please note that the Python code uses `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` which are not available in Java. I have removed those parts from the Java code.

