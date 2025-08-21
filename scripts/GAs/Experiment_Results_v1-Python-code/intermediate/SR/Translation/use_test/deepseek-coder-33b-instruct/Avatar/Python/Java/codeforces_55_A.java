Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    private static int conditionOne = 368;
    private static int conditionTwo = 165;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        while (inputNumber % 2 == 0) {
            int divisor = 2;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(divisionOperation(divisor, inputNumber));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            inputNumber = queue.take();
        }

        if ((conditionOne & conditionTwo) != 0) {
            if (inputNumber == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int divisionOperation(int divisor, int inputNumber) {
        return inputNumber / divisor;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `queue` module. Instead, we use `BlockingQueue` from `java.util.concurrent` package. Also, Java does not have a direct equivalent to Python's `threading` module. Instead, we use `ThreadPoolExecutor` from `java.util.concurrent` package.

