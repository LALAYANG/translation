```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class TowerHeight {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(args[i + 1]);
        }

        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort();

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
            Queue<Integer> towerHeightQueue = new Queue<>();

            Thread towerHeightCalculationThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = calculateTowerHeight(tower, heightDifference);
                    towerHeightQueue.add(result);
                }
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
        recursiveLoop(i + step, stop, step);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}
```
Note: The above code is a direct translation of the Python code you provided, but it may not be the most efficient or idiomatic Java code.
