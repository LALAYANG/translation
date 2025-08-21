
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(iterations, iterations, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        Lock lock = new ReentrantLock();
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i + 1]);
            executor.execute(() -> {
                lock.lock();
                try {
                    System.out.println(computeResult(n));
                } finally {
                    lock.unlock();
                }
            });
        }
        executor.shutdown();
    }

    private static int computeResult(int n) {
        int variable313 = 2;
        int variable713 = 1;
        int result = (variable713 + n) * n / variable313;
        for (int i = 1; i <= n; i++) {
            result -= 2 * i;
        }
        return result;
    }
}
```
This code uses the `ThreadPoolExecutor` class from the `java.util.concurrent` package to create a thread pool with the specified number of threads. It then uses the `Lock` class from the `java.util.concurrent.locks` package to synchronize access to the `computeResult` method.

The `computeResult` method is the same as the Python function, with the exception that it uses the `int` type instead of `long` for the variables.

The `main` method takes the number of iterations as a command-line argument and creates a thread pool with that many threads. It then loops over the input numbers and submits a task to the thread pool for each number. The task is a lambda expression that calls the `computeResult` method with the input number and prints the result to the console.

Finally, the `main` method shuts down the thread pool.

Note that this code assumes that the input numbers are positive integers. If the input numbers can be negative, you will need to modify the `computeResult` method to handle that case.
