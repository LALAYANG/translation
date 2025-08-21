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
        Arrays.sort(l);

        class IncrementCountThread extends Thread {
            private int high;
            private int incrementAmount;
            private Queue<Integer> queue;

            public IncrementCountThread(int high, int incrementAmount, Queue<Integer> queue) {
                this.high = high;
                this.incrementAmount = incrementAmount;
                this.queue = queue;
            }

            @Override
            public void run() {
                int result = incrementCount(high, incrementAmount);
                queue.add(result);
            }
        }

        class DecrementTowerThread extends Thread {
            private int tower;
            private int decrementAmount;
            private Queue<Integer> queue;

            public DecrementTowerThread(int tower, int decrementAmount, Queue<Integer> queue) {
                this.tower = tower;
                this.decrementAmount = decrementAmount;
                this.queue = queue;
            }

            @Override
            public void run() {
                int result = decrementTower(tower, decrementAmount);
                queue.add(result);
            }
        }

        void processList(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            if (l[i] == l[i - 1]) {
                int decrementAmount = 1;
                Queue<Integer> decrementQueue = new LinkedBlockingQueue<>();
                DecrementTowerThread decrementTowerThread = new DecrementTowerThread(tower, decrementAmount, decrementQueue);
                decrementTowerThread.start();
                try {
                    decrementTowerThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tower = decrementQueue.poll();
                int incrementAmount = 1;
                Queue<Integer> queueIncrementCount0 = new LinkedBlockingQueue<>();
                IncrementCountThread incrementCountThread0 = new IncrementCountThread(high, incrementAmount, queueIncrementCount0);
                incrementCountThread0.start();
                try {
                    incrementCountThread0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                high = queueIncrementCount0.poll();
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
            processList(i + step, stop, step);
        }

        processList(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }

    static int incrementCount(int high, int incrementAmount) {
        return increment(high, incrementAmount);
    }

    static int decrementTower(int tower, int decrementAmount) {
        return decrement(tower, decrementAmount);
    }
}