```java
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }

    public static void main(String[] args) {
        int totalItems = 1;
        int a = 10000;
        int sho = totalItems / a;
        int remainderItems = totalItems % a;

        if (remainderItems != 0) {
            int incrementValue = 1;
            Queue<Integer> queueCalculateSho = new ConcurrentLinkedQueue<>();

            Thread threadCalculateSho = new Thread(() -> {
                int resultSho = calculateSho(incrementValue, sho);
                queueCalculateSho.add(resultSho);
            });

            threadCalculateSho.start();
            try {
                threadCalculateSho.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int resultCalculateSho = queueCalculateSho.poll();
            sho = resultCalculateSho;
        }

        System.out.println(sho);
    }
}
```
