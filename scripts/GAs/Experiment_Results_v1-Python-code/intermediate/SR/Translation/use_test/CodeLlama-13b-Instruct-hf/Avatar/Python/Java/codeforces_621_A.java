
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }
        int od = 0;
        int checkOne = 619;
        int checkTwo = 634;
        for (int i = 0; i < n; i++) {
            if ((checkOne & checkTwo) != 0) {
                if (lst[i] % 2 != 0) {
                    int oddNumber = 1;
                    BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

                    Thread threadCalculateSum0 = new Thread(() -> {
                        int result = calculateSum(oddNumber, od);
                        calculationQueue.put(result);
                    });
                    threadCalculateSum0.start();
                    threadCalculateSum0.join();
                    int resultCalculateSum0 = calculationQueue.take();
                    od = resultCalculateSum0;
                }
            }
        }
        int sum = 0;
        int ok = 0;

        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }

    private static int calculateSum(int oddNumber, int od) {
        return od + oddNumber;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to handle the multi-threading, and the `java.util.concurrent.BlockingQueue` class to implement the queue. The `java.util.concurrent.LinkedBlockingQueue` class is used to create a blocking queue that can be used to communicate between the threads.

Also, note that the Java code uses the `java.lang.Thread` class to create a new thread, and the `java.lang.Runnable` interface to define the task that the thread will execute. The `java.lang.Thread.start()` method is used to start the thread, and the `java.lang.Thread.join()` method is used to wait for the thread to finish its execution.

Finally, note that the Java code uses the `java.util.concurrent.BlockingQueue.put()` method to put an element in the queue, and the `java.util.concurrent.BlockingQueue.take()` method to take an element from the queue.
