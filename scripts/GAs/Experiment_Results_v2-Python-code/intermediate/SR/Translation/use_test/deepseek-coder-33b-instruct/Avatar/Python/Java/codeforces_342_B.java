```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int calculateSum(int k, int increment) {
        return k + increment;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int d = s < f ? 1 : -1;
        int c = d == 1 ? 'R' : 'L';
        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = 1;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, workQueue);
        while (j != f) {
            if (i > t && k < m) {
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
                int increment = 1;
                int finalK = k;
                int finalIncrement = increment;
                executor.submit(() -> k = calculateSum(finalK, finalIncrement));
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append('X');
            } else {
                res.append((char) c);
                j += d;
            }
            i++;
        }
        executor.shutdown();
        System.out.println(res.toString());
    }
}
```

