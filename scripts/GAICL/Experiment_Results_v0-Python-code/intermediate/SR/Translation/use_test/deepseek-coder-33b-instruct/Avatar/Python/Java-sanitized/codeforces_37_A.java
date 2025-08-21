import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_37_A {
    private static int high = 1;
    private static int tower;
    private static int maximum = 1;
    private static int[] l;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        tower = n;
        Arrays.sort(l);
        processList(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void processList(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                try {
                    queue.put(decrementTower(tower, 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.execute(() -> {
                try {
                    queue.put(incrementCount(high, 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = queue.poll();
            high = queue.poll();
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        processList(i + step, stop, step);
    }

    private static int incrementCount(int high, int incrementAmount) {
        return high + incrementAmount;
    }

    private static int decrementTower(int tower, int decrementAmount) {
        return tower - decrementAmount;
    }
}