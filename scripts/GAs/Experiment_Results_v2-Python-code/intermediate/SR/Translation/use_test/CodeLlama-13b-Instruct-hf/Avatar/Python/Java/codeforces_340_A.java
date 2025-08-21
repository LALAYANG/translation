
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;

        BlockingQueue<Integer> queue_L0 = new LinkedBlockingQueue<>();

        Thread thread_L0 = new Thread(() -> {
            int result = leastCommonMultiple(x, y);
            queue_L0.put(result);
        });

        thread_L0.start();
        thread_L0.join();

        int result_L0 = queue_L0.take();
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int localLoopCounterOne = 686;
        int localLoopCounterTwo = 685;
        while (localLoopCounterOne % localLoopCounterTwo == 1) {
            localLoopCounterOne++;
            while (a % b != 0) {
                (a, b) = (b, a % b);
            }
        }
        return b;
    }
}
```
Note that the Java code uses the `BlockingQueue` class from the `java.util.concurrent` package to implement the queue used in the Python code. The `LinkedBlockingQueue` class is used to create a thread-safe queue that can be accessed by multiple threads. The `take()` method is used to retrieve the result from the queue, and the `put()` method is used to add the result to the queue.

Also, note that the Java code uses the `Thread` class from the `java.lang` package to create a new thread that runs the `L_thread` method. The `start()` method is used to start the thread, and the `join()` method is used to wait for the thread to finish.

The rest of the code is similar to the Python code, with the exception of the `print()` statement, which is replaced by a call to `System.out.println()` to print the result to the console.
