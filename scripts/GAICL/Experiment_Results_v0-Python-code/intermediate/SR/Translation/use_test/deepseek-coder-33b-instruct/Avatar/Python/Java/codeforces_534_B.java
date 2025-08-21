Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static int initial_velocity;
    private static int v2;
    private static int t;
    private static int d;
    private static int a = 1;
    private static int v;
    private static int distance = 0;
    private static int condition_check_1 = 348;
    private static int condition_check_2 = 296;
    private static int inner_loop_limit = 722;
    private static int outer_loop_limit = 721;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        initial_velocity = scanner.nextInt();
        v2 = scanner.nextInt();
        t = scanner.nextInt();
        d = scanner.nextInt();
        v = initial_velocity;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((condition_check_1 & condition_check_2) != 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Future<Integer> future = executor.submit(() -> calculate_distance(v, distance));
                distance = future.get();
                v += a * d;
            }
        }
        executor.shutdown();
        System.out.println(distance);
    }

    private static int calculate_distance(int v, int distance) {
        return distance + v;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java code.

Also, the Python code uses the `queue` module to pass data between threads. In Java, we use `ExecutorService` and `Future` to achieve the same functionality.

The Java code reads the input from the console using `Scanner`. If you want to provide the input from a file or another source, you will need to modify the code accordingly.

