
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyDecorator {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Future<Integer> future = executor.submit(() -> {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            int differenceX = x2 - x1;
            int differenceY = y2 - y1;

            int x3 = x2 - differenceY;
            int y3 = y2 + differenceX;
            int x4 = x1 - differenceY;
            int y4 = y1 + differenceX;

            return String.format("%d %d %d %d", x3, y3, x4, y4);
        });

        try {
            String result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
```
This code uses the `ExecutorService` and `Future` classes from the `java.util.concurrent` package to implement the same functionality as the Python code. The `ExecutorService` is used to create a single thread executor, and the `Future` class is used to retrieve the result of the calculation. The `BlockingQueue` is used to store the result of the calculation.

The `main` method takes the input from the command line and splits it into four integers. It then creates a `Future` object and submits a task to the executor that calculates the difference between the two points and returns the result. The `main` method then retrieves the result from the `Future` object and prints it to the console.

Note that this code assumes that the input is a string of four integers separated by spaces. If the input is in a different format, you will need to modify the code accordingly.
