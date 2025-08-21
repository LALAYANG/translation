
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        int[] resultArray = new int[n];
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
        Thread workerThread = new Thread(() -> {
            int result = calculateProduct(arr, n);
            resultQueue.put(result);
        });
        workerThread.start();
        try {
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = resultQueue.take();
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
        System.out.println(String.join(" ", resultArray));
    }

    private static int calculateProduct(int[] arr, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= arr[i];
        }
        return result;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread that calculates the product of the input array, and uses a `BlockingQueue` to communicate the result between the main thread and the worker thread. The `BlockingQueue` is a thread-safe data structure that allows the main thread to wait for the result to be calculated by the worker thread.

Also, note that the `calculateProduct` method is a helper method that calculates the product of the input array, and is called by the worker thread.

I hope this helps! Let me know if you have any questions or need further assistance.
