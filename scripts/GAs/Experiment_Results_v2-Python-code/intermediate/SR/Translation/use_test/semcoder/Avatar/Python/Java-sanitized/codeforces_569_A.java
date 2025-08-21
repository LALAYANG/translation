import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_569_A {
    public static int calculateProduct(int s, int q) {
        return s * q;
    }

    public static void main(String[] args) {
        int targetValue = 12351;
        int s = 1223;
        int q = 6;

        int operationCount = 0;
        int loopCounterOne = 608;
        int loopCounterTwo = 607;

        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (s < targetValue) {
                Queue<Integer> queueCalculateProduct0 = new LinkedBlockingQueue<>();

                Thread calculateProductThread = new Thread(() -> {
                    int calculationResult = calculateProduct(s, q);
                    queueCalculateProduct0.add(calculationResult);
                });

                calculateProductThread.start();
                try {
                    calculateProductThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int resultCalculateProduct0 = queueCalculateProduct0.poll();
                s = resultCalculateProduct0;
                operationCount++;
            }
        }

        System.out.println(operationCount);
    }
}