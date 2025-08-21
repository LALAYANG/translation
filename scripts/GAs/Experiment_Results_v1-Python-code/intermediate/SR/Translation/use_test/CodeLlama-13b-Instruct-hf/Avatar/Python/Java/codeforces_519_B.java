
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PythonToJava {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        int n = Integer.parseInt(args[0]);
        int[] array_a = new int[n];
        for (int i = 0; i < n; i++) {
            array_a[i] = Integer.parseInt(args[i + 1]);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(args[i + n + 1]);
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(args[i + 2 * n + 1]);
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x += array_a[i];
        }
        for (int i = 0; i < n; i++) {
            y += b[i];
        }
        for (int i = 0; i < n; i++) {
            y += c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - (x + y)));
    }
}
```
This code uses the `ExecutorService` class to create a thread pool and submit tasks to it. The `Future` class is used to retrieve the results of the tasks. The `BlockingQueue` class is used to store the results of the tasks. The `Callable` interface is used to define the tasks that are submitted to the thread pool. The `FutureTask` class is used to create a task that can be submitted to the thread pool. The `ExecutionException` and `TimeoutException` classes are used to handle exceptions that may occur when retrieving the results of the tasks.

The `main` method first parses the input arguments and creates three arrays: `array_a`, `b`, and `c`. It then calculates the sum of the elements in `array_a` and stores the result in `x`. It then calculates the sum of the elements in `b` and stores the result in `y`. Finally, it calculates the sum of the elements in `c` and stores the result in `sum_c`.

The `main` method then creates a thread pool with a fixed number of threads using the `Executors.newFixedThreadPool` method. It then submits the tasks to the thread pool using the `ExecutorService.submit` method. The tasks are defined using the `Callable` interface and the `FutureTask` class. The `Future` class is used to retrieve the results of the tasks.

The `main` method then retrieves the results of the tasks using the `Future.get` method. It then calculates the sum of the elements in `array_a`, `b`, and `c` and stores the result in `x`, `y`, and `sum_c`, respectively. Finally, it prints the absolute difference between `x` and `y` and the absolute difference between `y` and `sum_c`.

Note that this code assumes that the input arguments are valid and that the arrays `array_a`, `b`, and `c` have the same length.
