```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TowerHeight {
    private static int high = 1;
    private static int maximum = 1;
    private static int tower;
    private static int[] l;
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateTowerHeight(n, 1, 1));
        int result = future.get();
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + result);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }

    private static int calculateTowerHeight(int i, int stop, int step) throws InterruptedException {
        lock.lock();
        try {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return 0;
            }
            if (l[i] == l[i - 1]) {
                int heightDifference = 1;
                int calculatedTowerHeight = calculateTowerHeight(tower, heightDifference);
                tower = calculatedTowerHeight;
                high = high + 1;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
            return calculateTowerHeight(i + step, stop, step);
        } finally {
            lock.unlock();
        }
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        // TODO: Implement the calculation of tower height
        return tower - heightDifference;
    }
}
```

Test input:
4
6 5 6 7

Expected output:
2 3 
