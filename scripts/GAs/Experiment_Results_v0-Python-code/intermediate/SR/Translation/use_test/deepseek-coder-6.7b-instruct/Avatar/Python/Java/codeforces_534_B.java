```java
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    private static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int initialVelocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initialVelocity;
        int conditionCheck1 = 348;
        int conditionCheck2 = 296;
        int innerLoopLimit = 722;
        int outerLoopLimit = 721;
        int distance = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Callable<Integer> callable = () -> calculateDistance(v, distance);
                Future<Integer> future = executorService.submit(callable);
                distance = future.get();
                v += a * d;
            }
        }
        executorService.shutdown();
        System.out.println(distance);
    }
}
```

Please note that the `ttest_ind([27, 23, 6], [98, 97, 30])` line in the Python code is not used in the Java code. It's a function from the scipy library for performing a two-sample t-test, which is not needed for the problem at hand.

Also, the Python code uses bitwise AND (`&`) for the condition check, while the Java code uses bitwise AND (`&`) for the same purpose.

The Python code uses threading and queue to handle the calculation of distance in a separate thread, while the Java code uses ExecutorService and Future to achieve the same result.

