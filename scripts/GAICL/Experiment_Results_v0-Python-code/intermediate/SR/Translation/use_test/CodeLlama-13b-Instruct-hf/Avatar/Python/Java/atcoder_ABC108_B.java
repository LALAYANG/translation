
Here is the Java code equivalent to the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int diffX = x2 - x1;
            int diffY = y2 - y1;

            return diffX + diffY;
        });

        Future<Integer> future2 = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int diffX = x2 - x1;
            int diffY = y2 - y1;

            return diffX + diffY;
        });

        int result1 = future1.get();
        int result2 = future2.get();

        System.out.println(result1 + " " + result2);

        executor.shutdown();
    }
}
```
This code uses the `ExecutorService` class to create a thread pool with two threads, and submits two tasks to the pool. Each task computes the difference between two pairs of coordinates and returns the sum of the differences. The main thread then retrieves the results from the futures and prints them to the console.

Note that this code assumes that the input coordinates are passed as command-line arguments, and that the output should be printed to the console. If you need to modify the code to read the input from a file or write the output to a file, you can do so by modifying the `main` method accordingly.
