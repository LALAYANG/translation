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
        Future<Integer> future = executor.submit(() -> calculateProduct(1, n));
        int calculationResult = future.get();
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

        int[] resultArray = new int[n];
        recursiveArray(0, n, 1, resultArray);

        int res = 0;
        recursiveSum(1, n, 1, resultArray, res);
        System.out.println(res);
    }

    public static int calculateProduct(int variable_1_10, int n) {
        return variable_1_10 * n;
    }

    public static void recursiveArray(int i, int stop, int step, int[] resultArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        resultArray[a[i] - 1] = i;
        recursiveArray(i + step, stop, step, resultArray);
    }

    public static void recursiveSum(int i, int stop, int step, int[] resultArray, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(resultArray[i] - resultArray[i - 1]);
        recursiveSum(i + step, stop, step, resultArray, res);
    }
}
```

Sample test case:
```
100
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
```

Expected output:
```
99
``` 
