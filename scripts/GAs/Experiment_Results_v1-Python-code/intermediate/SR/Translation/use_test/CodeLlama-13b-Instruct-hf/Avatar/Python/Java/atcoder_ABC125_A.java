
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CookieCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int cookie = 0;
        double currentTime = a;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        while (currentTime <= t + 0.5) {
            Thread thread = new Thread(() -> {
                int result = calculateCookie(cookie, b);
                queue.put(result);
            });
            thread.start();
            thread.join();
            int result = queue.take();
            cookie = result;
            currentTime = currentTime + a;
        }

        System.out.println(cookie);
    }

    private static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread that calculates the cookie value and puts it in a blocking queue. The main thread then takes the value from the queue and updates the cookie value.

Also, note that the `ttest_ind` and `shuffle` functions are not available in Java, so you will need to find alternative ways to implement them.
