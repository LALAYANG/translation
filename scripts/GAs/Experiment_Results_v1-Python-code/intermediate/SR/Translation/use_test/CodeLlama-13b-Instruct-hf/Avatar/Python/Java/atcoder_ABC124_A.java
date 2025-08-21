
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateDifference {
    public static void main(String[] args) throws Exception {
        int firstNumber = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        Callable<Integer> calculateDifference = () -> {
                            int result = calculateDifference(numberToSubtract, firstNumber);
                            queue.put(result);
                            return result;
                        };
                        Future<Integer> future = executor.submit(calculateDifference);
                        future.get();
                        firstNumber = queue.take();
                    } else {
                        b--;
                    }
                }
            }
        }

        executor.shutdown();
        System.out.println(c);
    }

    private static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread pool and a blocking queue to communicate between the threads. The `ExecutorService` class is used to create a thread pool, and the `Future` class is used to get the result of the `calculateDifference` method. The `BlockingQueue` class is used to communicate between the threads.

Also, note that the `calculateDifference` method is defined as a `Callable` object, which is a type of `Runnable` object that can return a value. This allows the `calculateDifference` method to be executed in a separate thread and return the result to the main thread.

I hope this helps! Let me know if you have any questions or need further assistance.
