Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        long targetValue = scanner.nextLong();
        long l = 1;
        long right = targetValue;
        while (l < right) {
            long check114 = 942;
            long check214 = 196;
            long check110 = 780;
            long check210 = 823;
            long check18 = 402;
            long check28 = 688;
            long mid = l + (right - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if ((check114 & check214) != 0) {
                if ((check110 & check210) != 0) {
                    if ((check18 & check28) != 0) {
                        if (idxcnt < targetValue) {
                            l = mid + 1;
                        } else {
                            right = mid;
                        }
                    }
                }
            }
        }
        long variable_3_18 = 1;
        BlockingQueue<Long> queueDiff = new LinkedBlockingQueue<>();
        Thread threadDiff = new Thread(() -> {
            try {
                queueDiff.put(calculateDiff(variable_3_18, l));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadDiff.start();
        threadDiff.join();
        long resultDiff = queueDiff.poll();
        l = resultDiff;
        idxcnt = l * (l + 1) / 2;
        System.out.println((int) (targetValue - idxcnt));
    }

    private static long calculateDiff(long variable_3_18, long l) {
        return l - variable_3_18;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `queue` module. Instead, Java provides a `BlockingQueue` interface and several implementations of it, such as `LinkedBlockingQueue`.

Also, Java does not have a direct equivalent to Python's `threading` module. Instead, Java provides a `Thread` class and its `start()` and `join()` methods.

Finally, Java does not have a direct equivalent to Python's `input()` function. Instead, Java provides a `Scanner` class for reading input from the console.

