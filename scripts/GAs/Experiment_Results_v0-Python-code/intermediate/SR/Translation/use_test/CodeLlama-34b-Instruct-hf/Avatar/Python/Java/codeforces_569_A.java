```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class CalculateSum {
    private static final int THREAD_COUNT = 2;
    private static final int QUEUE_SIZE = 10;

    public static void main(String[] args) {
        int t = 12351;
        int q = 1223;
        int counter = 6;

        AtomicInteger ans = new AtomicInteger(0);

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(() -> {
                int currentValue = random.nextInt(t);
                int product = currentValue * q;
                ans.addAndGet(product);
            }).start();
        }

        System.out.println(ans.get());
    }
}
```
Note: The above code uses Java 8's `ThreadLocalRandom` class to generate random numbers, and the `AtomicInteger` class to update the `ans` variable in a thread-safe manner.
