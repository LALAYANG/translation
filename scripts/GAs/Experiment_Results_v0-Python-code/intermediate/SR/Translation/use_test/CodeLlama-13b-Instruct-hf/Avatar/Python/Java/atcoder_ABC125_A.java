
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateSum {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int resultAccumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable39 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread workerThread = new Thread(() -> {
                int result = calculateSum(counter1, variable39);
                resultQueue.put(result);
            });
            workerThread.start();
            workerThread.join();
            int workerResult = resultQueue.get();
            counter1 = workerResult;
            while (time <= t + 0.5) {
                resultAccumulator = resultAccumulator + b;
                time = time + a;
            }
        }
        System.out.println(resultAccumulator);
    }

    private static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread pool and a blocking queue to communicate between the main thread and the worker threads. The `LinkedBlockingQueue` class is used to create a blocking queue that can be used to store the results of the calculations performed by the worker threads. The `Thread` class is used to create a new thread that will perform the calculation and store the result in the blocking queue. The `join()` method is used to wait for the worker thread to finish before continuing with the main thread. The `get()` method is used to retrieve the result from the blocking queue.
