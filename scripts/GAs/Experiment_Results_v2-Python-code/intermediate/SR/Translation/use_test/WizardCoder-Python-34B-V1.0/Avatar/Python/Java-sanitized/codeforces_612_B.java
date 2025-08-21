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
        int[] numberArray = new int[n];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(() -> {
            for (int i = 0; i < n; i++) {
                numberArray[i] = a[i] * n;
            }
            return numberArray;
        });
        int[] indexedArray = future.get();
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexedArray[i] - indexedArray[i - 1]);
        }
        System.out.println(res);
    }
}