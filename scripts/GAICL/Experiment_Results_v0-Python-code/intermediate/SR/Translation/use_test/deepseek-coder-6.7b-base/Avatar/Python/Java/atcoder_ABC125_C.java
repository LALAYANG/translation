```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[][] ruiseki_lr(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        left[0] = 0;
        right[n] = 0;
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new int[][] {left, right};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[][]> future = executor.submit(new Callable<int[][]>() {
            @Override
            public int[][] call() {
                return ruiseki_lr(array);
            }
        });
        try {
            int[][] result = future.get();
            int[] left = result[0];
            int[] right = result[1];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(gcd(left[i], right[i + 1]), ans);
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
```

