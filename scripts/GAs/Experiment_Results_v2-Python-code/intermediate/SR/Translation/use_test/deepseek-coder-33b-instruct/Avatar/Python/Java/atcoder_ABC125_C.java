Here is the Java translation of the Python code. Note that Java does not have built-in support for threads or queues, so I've used the ExecutorService and Future classes to achieve similar functionality.

```java
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[][]> future = executor.submit(new RuisekiLRThread(a));
        int[][] result = future.get();
        executor.shutdown();

        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static class RuisekiLRThread implements Callable<int[][]> {
        private final int[] a;

        public RuisekiLRThread(int[] a) {
            this.a = a;
        }

        @Override
        public int[][] call() throws Exception {
            int n = a.length;
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            for (int i = 0; i < n; i++) {
                left[i + 1] = gcd(left[i], a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], a[i]);
            }
            return new int[][]{left, right};
        }
    }
}
```

Please note that the t-test function in the Python code is not used in the Java code, as there is no equivalent in Java's standard library. If you need to use this function, you may need to implement it yourself or find a third-party library that provides it.

