
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int loopCounter = 875;
        int loopRemainder = 874;
        int innerLoopCounter = 1;
        int j = n * n;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        while (loopCounter % loopRemainder == 1) {
            int constantValue = 1;
            Thread threadCalculateSum0 = new Thread(() -> {
                int result = calculateSum(loopCounter, constantValue);
                resultQueue.put(result);
            });
            threadCalculateSum0.start();
            threadCalculateSum0.join();
            int sumResult = resultQueue.get();
            loopCounter = sumResult;
            while (innerLoopCounter < j) {
                System.out.println(innerLoopCounter + " " + j);
                innerLoopCounter++;
                j--;
            }
        }
    }

    private static int calculateSum(int loopCounter, int constantValue) {
        return loopCounter + constantValue;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create threads and a blocking queue to communicate between the threads. The `LinkedBlockingQueue` class is used to create a blocking queue that can be used to store the results of the calculations. The `Thread` class is used to create a new thread that will execute the `calculateSum` method. The `join` method is used to wait for the thread to finish before continuing with the rest of the code. The `get` method is used to retrieve the result from the blocking queue.
