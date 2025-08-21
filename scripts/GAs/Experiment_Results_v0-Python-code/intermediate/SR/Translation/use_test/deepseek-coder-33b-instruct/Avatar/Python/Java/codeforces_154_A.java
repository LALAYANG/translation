Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int CHECKER_1 = 299;
    private static final int CHECKER_2 = 517;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        int ans = 0;
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(n, n, 0L, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            int a = 0, b = 0;
            for (char j : s.toCharArray()) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (j == x.charAt(0)) {
                        a++;
                    } else if (j == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            executor.execute(() -> ans += Math.min(a, b));
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println(ans);
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to manage the threads. The `calculate_ans` function is replaced with a lambda function that updates the `ans` variable. The `queue` object is used to manage the threads. The `executor.shutdown()` and `executor.awaitTermination()` methods are used to wait for all threads to finish before printing the result.

