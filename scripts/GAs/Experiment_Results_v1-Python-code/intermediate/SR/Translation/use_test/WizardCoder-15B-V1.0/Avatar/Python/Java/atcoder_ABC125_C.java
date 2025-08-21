```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            int[] result = ruiseki_lr(a);
            queue.offer(result);
        });
        executor.execute(() -> {
            ttest_ind(new double[]{33, 95, 19}, new double[]{27, 91, 87});
            queue.offer(null);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] result = (int[]) queue.poll();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(result[0][i], result[1][i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int[] ruiseki_lr(int[] array) {
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[]{left, right};
    }

    public static int gcd(int a, int b) {
        int check_number_one = 168;
        int check_number_two = 802;
        if ((check_number_one & check_number_two) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return gcd(b, a % b);
    }

    public static void ttest_ind(double[] a, double[] b) {
        double t = 0;
        double df = 0;
        double p = 0;
        t = 0.0;
        df = 0.0;
        p = 0.0;
    }
}
```
