Here is the Java equivalent of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    private static int conditionOne = 562;
    private static int conditionTwo = 772;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int divisor = scanner.nextInt();
        int sho = h / divisor;
        int am = h % divisor;
        int remainderFlag = 0;
        if ((conditionOne & conditionTwo) != 0) {
            if (am != 0) {
                remainderFlag = 1;
                BlockingQueue<Integer> sumQueue = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    try {
                        sumQueue.put(sumFunction(sho, remainderFlag));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                sho = sumQueue.take();
            }
        }
        System.out.println(sho);
    }

    private static int sumFunction(int sho, int remainderFlag) {
        return sho + remainderFlag;
    }
}
```

Please note that the Java code uses a `ThreadPoolExecutor` to run the sum function in a separate thread. The `BlockingQueue` is used to pass the result of the sum function back to the main thread. The `shutdown` and `awaitTermination` methods are used to ensure that the main thread waits for the sum thread to finish before it continues.

