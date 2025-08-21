
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SumOperands {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int remainder = Integer.parseInt(args[1]);
        int currentValue = 849;
        int divisor = 848;
        int operand = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread threadSumOperands0 = new Thread(() -> {
            int result = sumOperands(operand, currentValue);
            resultQueue.put(result);
        });
        threadSumOperands0.start();
        threadSumOperands0.join();
        int sumResult = resultQueue.get();
        currentValue = sumResult;

        while (remainder >= i) {
            remainder = remainder - i;
            i = i % n + 1;
        }
        System.out.println(remainder);
    }

    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create threads and a blocking queue to communicate between the threads. The `LinkedBlockingQueue` class is used to create a blocking queue that can be used to store the results of the sum operation. The `Thread` class is used to create a new thread that executes the `sumOperands` method. The `join()` method is used to wait for the thread to finish executing before continuing with the rest of the code. The `get()` method is used to retrieve the result from the blocking queue.
