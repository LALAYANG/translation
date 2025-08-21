Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static String a, b;
    private static int x, c;
    private static StringBuilder s;
    private static BlockingQueue<Runnable> queue;
    private static ThreadPoolExecutor executor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        b = scanner.next();
        x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%-" + x + "s", b).replace(' ', '0');
        s = new StringBuilder();
        c = 0;
        queue = new LinkedBlockingQueue<>();
        executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);
        processDigits(0, x, 1);
        if (c == 1) {
            s.append('1');
        }
        System.out.println(s.reverse().toString());
    }

    private static void processDigits(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int d = Integer.parseInt(String.valueOf(b.charAt(i))) + Integer.parseInt(String.valueOf(a.charAt(x - i - 1))) + c;
        if (d > 9) {
            s.append(String.valueOf(d).charAt(1));
            c = 1;
        } else {
            s.append(String.valueOf(d));
            c = 0;
        }
        executor.execute(() -> processDigits(i + step, stop, step));
    }
}
```

Please note that Java does not support multithreading in the same way as Python does. Therefore, the code above uses a `ThreadPoolExecutor` to simulate the multithreading behavior.

