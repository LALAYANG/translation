
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaCode {
    public static void main(String[] args) {
        int n = 100;
        int x = 18132779;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        int maxOuterIterations = 848;
        int innerLoopStep = 847;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int currentValue : a) {
                if (currentValue > x) {
                    x = 0;
                    break;
                }
                Queue<Integer> queueCalculateDifference0 = new ArrayDeque<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.submit(() -> {
                    int result = calculateDifference(currentValue, x);
                    queueCalculateDifference0.add(result);
                });
                executorService.shutdown();
                int resultCalculateDifference0 = queueCalculateDifference0.poll();
                x = resultCalculateDifference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int currentValue, int x) {
        return x - currentValue;
    }
}
```
Note that I've used `ArrayDeque` instead of `Queue` in Java, as `Queue` is an interface and `ArrayDeque` is a concrete implementation of a queue. Also, I've used `Executors.newSingleThreadExecutor()` to create a single-threaded executor service, which is used to submit the `calculateDifference` method as a task to be executed in a separate thread.

The equivalent Java code using the `Thread` class would look like this:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class JavaCode {
    public static void main(String[] args) {
        int n = 100;
        int x = 18132779;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        int maxOuterIterations = 848;
        int innerLoopStep = 847;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int currentValue : a) {
                if (currentValue > x) {
                    x = 0;
                    break;
                }
                Queue<Integer> queueCalculateDifference0 = new ArrayDeque<>();
                Thread threadCalculateDifference0 = new Thread(() -> {
                    int result = calculateDifference(currentValue, x);
                    queueCalculateDifference0.add(result);
                });
                threadCalculateDifference0.start();
                threadCalculateDifference0.join();
                int resultCalculateDifference0 = queueCalculateDifference0.poll();
                x = resultCalculateDifference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int currentValue, int x) {
        return x - currentValue;
    }
}
```
In this version, I've used the `Thread` class to create a new thread that executes the `calculateDifference` method. The `join()` method is used to wait for the thread to finish before continuing with the rest of the code.
