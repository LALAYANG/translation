import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_37_A {
    private static int high = 1;
    private static int maximum = 1;
    private static int tower;
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
        recursiveLoop(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void recursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int heightDifference = 1;
            BlockingQueue<Integer> towerHeightQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                int result = calculateTowerHeight(tower, heightDifference);
                try {
                    towerHeightQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTowerHeight = towerHeightQueue.poll();
            tower = calculatedTowerHeight;
            high = high + 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(i + step, stop, step);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}