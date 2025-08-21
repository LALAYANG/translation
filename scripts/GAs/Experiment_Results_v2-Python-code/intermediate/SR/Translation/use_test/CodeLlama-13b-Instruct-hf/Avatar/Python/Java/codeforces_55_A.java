
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DivisionOperation {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int divisor = 2;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = divisionOperation(inputNumber, divisor);
            queue.put(result);
        });

        thread.start();
        thread.join();

        int result = queue.take();
        inputNumber = result;

        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int divisionOperation(int inputNumber, int divisor) {
        return inputNumber / divisor;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create a thread and a blocking queue, and the `java.util.concurrent.LinkedBlockingQueue` class to create a blocking queue. The `divisionOperation` method is also moved to the `DivisionOperation` class.
