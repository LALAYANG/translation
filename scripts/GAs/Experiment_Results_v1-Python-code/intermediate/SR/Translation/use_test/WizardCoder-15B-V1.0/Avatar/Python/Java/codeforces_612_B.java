```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        Arrays.fill(b, -1);
        int[] factor = {0};
        Thread thread_calculate_product0 = new Thread(() -> {
            int product = calculateProduct(n, factor);
            queue_calculate_product0.offer(product);
        });
        thread_calculate_product0.start();
        try {
            thread_calculate_product0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_product0 = queue_calculate_product0.poll();
        b = result_calculate_product0;
        recursiveLoopOne(0, n, 1, b, a);
        int res = 0;
        recursiveLoopTwo(1, n, 1, b, a, res);
        System.out.println(res);
    }

    private static int calculateProduct(int n, int[] factor) {
        return factor[0] * n;
    }

    private static void recursiveLoopOne(int i, int stop, int step, int[] b, int[] a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        b[a[i] - 1] = i;
        recursiveLoopOne(i + step, stop, step, b, a);
    }

    private static void recursiveLoopTwo(int i, int stop, int step, int[] b, int[] a, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(b[i] - b[i - 1]);
        recursiveLoopTwo(i + step, stop, step, b, a, res);
    }
}
```
