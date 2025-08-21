import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_37_A {
    public static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] l = {6, 5, 6, 7};
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);

        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                int heightDifference = 1;
                Queue<Integer> towerHeightQueue = new LinkedBlockingQueue<>();

                Thread towerHeightCalculationThread = new Thread(() -> {
                    int result = calculateTowerHeight(tower, heightDifference);
                    towerHeightQueue.add(result);
                });
                towerHeightCalculationThread.start();
                try {
                    towerHeightCalculationThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int calculatedTowerHeight = towerHeightQueue.poll();
                tower = calculatedTowerHeight;
                high++;
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
    }
}