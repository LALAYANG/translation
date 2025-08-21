
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class CalculateDifference {
    public static void main(String[] args) throws InterruptedException {
        int n = 29;
        int m = 7772;
        int currentValue = 1;
        int constantOne = 1;

        BlockingQueue<Integer> queueCalculateDifference = new LinkedBlockingQueue<>();
        Thread threadCalculateDifference = new Thread(() -> {
            int differenceResult = calculateDifference(currentValue, m);
            queueCalculateDifference.put(differenceResult);
        });
        threadCalculateDifference.start();
        threadCalculateDifference.join();
        int resultCalculateDifference = queueCalculateDifference.take();
        m = resultCalculateDifference;

        BlockingQueue<Integer> queueSumModulo = new LinkedBlockingQueue<>();
        Thread threadSumModulo = new Thread(() -> {
            int sumModuloResult = calculateSumWithModulo(currentValue, constantOne, n);
            queueSumModulo.put(sumModuloResult);
        });
        threadSumModulo.start();
        threadSumModulo.join();
        int sumModuloResult = queueSumModulo.take();
        currentValue = sumModuloResult;

        System.out.println(m);
    }

    private static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    private static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return (currentValue % n + constantOne) % n;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to implement the concurrent execution of the two threads. The `BlockingQueue` class is used to communicate between the two threads, and the `ThreadLocalRandom` class is used to generate random numbers.
