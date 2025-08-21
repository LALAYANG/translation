```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TowerHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        recursiveLoop(l, 1, n, high, tower, maximum, queue, executor);
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(maximum + " " + tower);
    }

    private static void recursiveLoop(int[] l, int i, int n, int high, int tower, int maximum, LinkedBlockingQueue<Integer> queue, ExecutorService executor) {
        if (i == n) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int heightDifference = 1;
            tower -= heightDifference;
            executor.execute(() -> {
                int result = calculateTowerHeight(tower, heightDifference);
                queue.offer(result);
            });
            try {
                int calculatedTowerHeight = queue.take();
                tower = calculatedTowerHeight;
                high++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(l, i + 1, n, high, tower, maximum, queue, executor);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}
```
