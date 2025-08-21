import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_37_A {
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

        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Future<Integer> future = executor.submit(() -> {
            int result = decrementTower(tower, 1);
            queue.offer(result);
            return result;
        });
        int decrementedTower = queue.poll();
        tower = decrementedTower;
        Future<Integer> future2 = executor.submit(() -> {
            int result = incrementCount(high, 1);
            queue.offer(result);
            return result;
        });
        int incrementedCount = queue.poll();
        high = incrementedCount;

        for (int i = 2; i < n; i++) {
            if (l[i] == l[i - 1]) {
                int decrementAmount = 1;
                Future<Integer> future3 = executor.submit(() -> {
                    int result = decrementTower(tower, decrementAmount);
                    queue.offer(result);
                    return result;
                });
                int decrementedTower2 = queue.poll();
                tower = decrementedTower2;
                int incrementAmount = 1;
                Future<Integer> future4 = executor.submit(() -> {
                    int result = incrementCount(high, incrementAmount);
                    queue.offer(result);
                    return result;
                });
                int incrementedCount2 = queue.poll();
                high = incrementedCount2;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int decrementTower(int tower, int decrementAmount) {
        return tower - decrementAmount;
    }

    private static int incrementCount(int high, int incrementAmount) {
        return high + incrementAmount;
    }
}