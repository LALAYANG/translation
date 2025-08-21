```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateProduct(n, 1));
        int b = future.get();
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        recursiveLoopOne(0, n - 1, 1, a);

        int res = 0;
        recursiveLoopTwo(1, n - 1, 1, a, res);
        System.out.println(res);
    }

    public static int calculateProduct(int n, int factor) {
        return factor * n;
    }

    public static void recursiveLoopOne(int i, int stop, int step, int[] a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[a[i] - 1] = i;
        recursiveLoopOne(i + step, stop, step, a);
    }

    public static void recursiveLoopTwo(int i, int stop, int step, int[] a, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(a[i] - a[i - 1]);
        recursiveLoopTwo(i + step, stop, step, a, res);
    }
}
```

Test input:
100
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

Expected output:
99
``` 
