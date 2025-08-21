
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaTranslation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int q = scanner.nextInt();
                int h = scanner.nextInt();
                int s = scanner.nextInt();
                int d = scanner.nextInt();
                queue.add(q);
                queue.add(h);
                queue.add(s);
                queue.add(d);
            }
        });
        thread.start();
        thread.join();
        int n = scanner.nextInt();
        int best1L = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```
Note that I've used the `Math.min()` method to find the minimum value in the array, as it is not available in the Java standard library.

Also, I've used the `Scanner` class to read input from the user, as it is more convenient than using `System.in` directly.

Finally, I've used a `Thread` to read the input from the user, as it allows for more flexibility in terms of handling the input and the main thread.

I hope this helps! Let me know if you have any questions or need further assistance.
