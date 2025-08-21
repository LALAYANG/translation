Here is the Java version of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int carry = 0;
    private static String sumStr = "";

    public static void main(String[] args) throws InterruptedException {
        String a = "681692777";
        String b = "714636915";
        int x = Math.max(a.length(), b.length());
        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%-" + x + "s", b).replace(' ', '0');

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        for (int i = 0; i < x; i++) {
            final int index = i;
            executor.execute(() -> processDigits(a, b, index, x - 1, 1));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        if (carry == 1) {
            sumStr = sumStr + '1';
        }

        System.out.println(new StringBuilder(sumStr).reverse().toString());
    }

    private static void processDigits(String a, String b, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        char variable913 = b.charAt(i);
        char variable1113 = a.charAt(a.length() - i - 1);

        Thread thread = new Thread(() -> {
            try {
                queue.put(addDigits(variable913, variable1113, carry));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        try {
            thread.join();
            int result = queue.take();
            int d = result;
            if (d > 9) {
                sumStr += String.valueOf(d).substring(1);
                carry = 1;
            } else {
                sumStr += String.valueOf(d);
                carry = 0;
            }
            processDigits(a, b, i + step, stop, step);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int addDigits(char variable913, char variable1113, int carry) {
        return Character.getNumericValue(variable913) + Character.getNumericValue(variable1113) + carry;
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to manage threads, which is a more flexible and powerful way to manage threads than the Python `threading` module. Also, Java does not have a direct equivalent to Python's `queue` module, so a `BlockingQueue` is used instead.

