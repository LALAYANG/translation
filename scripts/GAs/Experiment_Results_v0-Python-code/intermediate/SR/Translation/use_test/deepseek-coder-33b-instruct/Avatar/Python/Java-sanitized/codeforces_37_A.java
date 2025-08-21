import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
            int decrementAmount = 1;
            BlockingQueue<Integer> decrementQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
            executor.execute(() -> decrementQueue.add(decrementTower(tower, decrementAmount)));
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = decrementQueue.poll();
            int incrementAmount = 1;
            BlockingQueue<Integer> incrementQueue = new LinkedBlockingQueue<>();
            executor.execute(() -> incrementQueue.add(incrementCount(high, incrementAmount)));
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            high = incrementQueue.poll();
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