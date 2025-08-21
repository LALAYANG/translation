Here is the Java version of your Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 14;
        int[] digits = {7, 7, 7, 7, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4};
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int index = 0; index < n; index++) {
            if (digits[index] != 4 && digits[index] != 7) {
                System.out.println("NO");
                x = 1;
                BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
                Thread thread = new Thread(() -> {
                    try {
                        queue.put(calculateSum(1, x));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
                thread.join();
                x = queue.take();
                break;
            }
            if (index < n / 2) {
                h1 += digits[index];
            } else {
                h2 += digits[index];
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int calculateSum(int variable_3_13, int x) {
        return x + variable_3_13;
    }
}
```

Please note that the Python code uses some libraries (like `scipy` and `sklearn`) that are not available in Java. Therefore, some parts of the code have been simplified or removed. Also, the threading and queue functionality in Python is replaced with the `Thread` and `BlockingQueue` classes in Java.

