
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Sho {
    public static void main(String[] args) {
        int totalItems = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int sho = totalItems / a;
        int remainderItems = totalItems % a;
        if (remainderItems != 0) {
            int incrementValue = 1;
            AtomicInteger resultSho = new AtomicInteger(sho);
            ThreadLocalRandom random = ThreadLocalRandom.current();
            Thread thread = new Thread(() -> {
                int result = calculateSho(incrementValue, sho);
                resultSho.set(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sho = resultSho.get();
        }
        System.out.println(sho);
    }

    private static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }
}
```
Note that the `ThreadLocalRandom` class is used to generate random numbers, and the `AtomicInteger` class is used to store the result of the calculation in a thread-safe way. The `Thread` class is used to create a new thread, and the `join()` method is used to wait for the thread to finish. The `get()` method is used to retrieve the result of the calculation from the `AtomicInteger` object.
