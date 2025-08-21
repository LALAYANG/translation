Here is the Java equivalent of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) throws InterruptedException {
        int initialVelocity = 100;
        int v2 = 10;
        int t = 100;
        int d = 10;
        int a = 1;
        int v = initialVelocity;
        int distance = 0;
        int conditionCheck1 = 348;
        int conditionCheck2 = 296;
        int innerLoopLimit = 722;
        int outerLoopLimit = 721;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Integer> functionQueue = new LinkedBlockingQueue<>();

        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Runnable functionThread = () -> {
                    int result = calculateDistance(v, distance);
                    try {
                        functionQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                };
                executor.execute(functionThread);
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                int functionResult = functionQueue.take();
                distance = functionResult;
                v += a * d;
            }
        }
        System.out.println(distance);
    }
}
```

Please note that the Java code uses a `ThreadPoolExecutor` to manage the threads, and a `BlockingQueue` to store the results of the threads. The `ThreadPoolExecutor` is configured to have a maximum of 1 thread, and the `BlockingQueue` is used to store the results of the threads. The `ThreadPoolExecutor` is then shut down and awaits termination before the next iteration of the loop.

Also, the `&` operator in Java is a bitwise AND operator, not a logical AND operator. Therefore, the condition `(conditionCheck1 & conditionCheck2) != 0` checks if both `conditionCheck1` and `conditionCheck2` are not zero.

The `calculateDistance` method is a direct translation of the Python function. The `main` method is the entry point of the Java program. It reads the input values, initializes the variables, and then enters a loop that performs the same operations as the Python code. The results are printed to the console.

