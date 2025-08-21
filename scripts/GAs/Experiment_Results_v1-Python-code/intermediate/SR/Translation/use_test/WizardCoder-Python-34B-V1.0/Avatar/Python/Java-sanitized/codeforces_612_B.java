import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_612_B {
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