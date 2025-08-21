Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int target_value = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        while (s < target_value) {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(calculateProduct(s, q));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            s = queue.take();
            ans++;
        }
        System.out.println(ans);
    }

    private static int calculateProduct(int s, int q) {
        return s * q;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. If you need to use this function, you may need to find a Java library that provides it or implement it yourself.

