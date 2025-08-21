
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateSum {
    public static void main(String[] args) {
        int wholeCandles = 3;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;
        int currentValue = 637;
        int loopBound = 636;

        while (currentValue % loopBound == 1) {
            int increment = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread threadCalculateSum0 = new Thread(() -> {
                int sumResult = calculateSum(currentValue, increment);
                resultQueue.put(sumResult);
            });
            threadCalculateSum0.start();
            threadCalculateSum0.join();
            int calculatedValue = resultQueue.get();
            currentValue = calculatedValue;

            while (wholeCandles > 0 || restoSciolte >= b) {
                wholeCandles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += wholeCandles;
                restoSciolte += wholeCandles % b;
                wholeCandles /= b;
            }
        }

        System.out.println(s);
    }

    private static int calculateSum(int currentValue, int increment) {
        return currentValue + increment;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create threads and a blocking queue to communicate between the threads. The `calculateSum` method is also moved to the `CalculateSum` class.
