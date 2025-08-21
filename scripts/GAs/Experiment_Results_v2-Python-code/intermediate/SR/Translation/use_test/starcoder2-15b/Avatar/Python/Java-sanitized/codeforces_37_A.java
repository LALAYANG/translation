import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        Queue<Integer> towerHeightQueue = new LinkedBlockingQueue<>();
        Thread towerHeightCalculationThread = new Thread(() -> {
            int heightDifference = 1;
            int calculatedTowerHeight = calculateTowerHeight(tower, heightDifference);
            towerHeightQueue.add(calculatedTowerHeight);
        });
        recursiveLoop(1, n, 1, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void recursiveLoop(int i, int stop, int step, int[] l, int high, int maximum, int tower, Queue<Integer> towerHeightQueue, Thread towerHeightCalculationThread) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            towerHeightCalculationThread.start();
            try {
                towerHeightCalculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = towerHeightQueue.poll();
            high = high + 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(i + step, stop, step, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}