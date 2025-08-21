
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CandleRemainder {
    public static void main(String[] args) {
        int candeleIntere = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int s = 0;
        int remainingCandles = 0;
        while (candeleIntere > 0 || remainingCandles >= b) {
            candeleIntere += calculateWholeCandles(b, remainingCandles);
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            Thread thread = new Thread(() -> {
                int result = calculateCandleRemainder(remainingCandles, b);
                queue.put(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int remainderCandles = queue.take();
            remainingCandles = remainderCandles;
            s = s + candeleIntere;
            remainingCandles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    private static int calculateWholeCandles(int b, int remainingCandles) {
        return remainingCandles / b;
    }

    private static int calculateCandleRemainder(int remainingCandles, int b) {
        return remainingCandles % b;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread and a blocking queue to communicate between the main thread and the worker thread. The `BlockingQueue` is used to store the result of the `calculateCandleRemainder` method, which is calculated by the worker thread. The main thread then retrieves the result from the queue and continues the loop.
