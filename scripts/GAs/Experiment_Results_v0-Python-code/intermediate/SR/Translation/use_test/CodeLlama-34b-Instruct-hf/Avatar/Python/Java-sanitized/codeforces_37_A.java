import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_37_A {
    public static void main(String[] args) {
        int n = 4;
        int[] l = {6, 5, 6, 7};
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort();

        for (int i = 1; i <= n; i++) {
            if (l[i] == l[i - 1]) {
                int decrementAmount = 1;
                Queue<Integer> decrementQueue = new Queue<>();

                Thread decrementThread = new Thread(() -> {
                    int result = decrement(tower, decrementAmount);
                    decrementQueue.add(result);
                });
                decrementThread.start();
                decrementThread.join();
                int decrementedTower = decrementQueue.poll();
                tower = decrementedTower;

                int incrementAmount = 1;
                Queue<Integer> incrementQueue = new Queue<>();

                Thread incrementThread = new Thread(() -> {
                    int result = increment(high, incrementAmount);
                    incrementQueue.add(result);
                });
                incrementThread.start();
                incrementThread.join();
                int incrementedCount = incrementQueue.poll();
                high = incrementedCount;
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

    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }
}