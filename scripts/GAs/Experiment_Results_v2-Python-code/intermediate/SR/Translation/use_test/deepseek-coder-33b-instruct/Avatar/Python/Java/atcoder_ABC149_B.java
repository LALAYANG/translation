Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();
        int cookieValues = scanner.nextInt();

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            try {
                queue.put(calculateDifference(thirdValue, firstValue));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        int result = queue.take();
        int leftOver = result;
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (cookieValues > 0 ? cookieValues : Math.max(0, cookieValues - Math.abs(leftOver))));
    }

    private static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}
```

Please note that the Java code does not include the functionality of the Python code that uses `scipy.stats.ttest_ind` and `numpy.max`, as these are not available in Java.

Also, the Python code uses `sklearn.utils.shuffle` to shuffle a list, but this is not used in the provided code. If you need to shuffle a list in Java, you can use `Collections.shuffle`.

The Java code uses `ThreadPoolExecutor` to create a thread and `BlockingQueue` to get the result from the thread. The `ThreadPoolExecutor` is used to manage the thread pool, and the `BlockingQueue` is used to store the result from the thread.

The `calculateDifference` method is a simple method that calculates the difference between two integers.

The `main` method reads the input from the console, creates a thread to calculate the difference, waits for the thread to finish, and then prints the result.

