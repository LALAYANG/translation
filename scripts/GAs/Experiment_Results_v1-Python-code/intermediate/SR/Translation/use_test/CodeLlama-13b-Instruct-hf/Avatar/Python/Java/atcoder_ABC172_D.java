
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = scanner.nextInt();
            queue.put(result);
        });

        thread.start();
        thread.join();

        int positiveIntegerInput = queue.take();
        int ans = 0;

        for (int i = 1; i <= positiveIntegerInput; i++) {
            ans += i * (positiveIntegerInput / i) * (positiveIntegerInput / i + 1) / 2;
        }

        System.out.println(ans);
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread that reads from the standard input and puts the result in a blocking queue. The main thread then takes the result from the queue and calculates the sum.

Also, note that the `Scanner` class is used to read from the standard input, and the `LinkedBlockingQueue` class is used to create a blocking queue.

I hope this helps! Let me know if you have any questions.
