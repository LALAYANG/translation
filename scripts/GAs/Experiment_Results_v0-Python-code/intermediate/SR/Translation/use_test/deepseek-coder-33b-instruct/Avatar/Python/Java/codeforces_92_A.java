Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 29;
        int m = 7772;
        AtomicInteger i = new AtomicInteger(1);
        int loopCounter = 319;
        int constantValue = 318;
        while (loopCounter % constantValue == 1) {
            loopCounter = loopCounter + 1;
            while (m >= i.get()) {
                m -= i.get();
                int value = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                Thread thread = new Thread(() -> {
                    int result = calculateResult(i.get(), n, value);
                    try {
                        resultQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
                thread.join();
                try {
                    i.set(resultQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m);
    }

    private static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}
```

Please note that the Java version of the code does not include the functionality of the Python code that uses the `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` functions, as these are not available in Java. Also, the Python code uses `input()` to get the input, but in Java, the input is hardcoded.

