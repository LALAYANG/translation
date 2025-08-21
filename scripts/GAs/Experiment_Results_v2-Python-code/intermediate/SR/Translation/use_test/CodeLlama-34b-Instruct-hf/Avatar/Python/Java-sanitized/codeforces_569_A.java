import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int loopCounterOne = 608;
        int loopCounterTwo = 607;
        int operationCount = 0;

        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (s < targetValue) {
                Queue<Integer> queueCalculateProduct0 = new Queue<>();

                Thread workerThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int calculationResult = calculateProduct(s, q);
                        queueCalculateProduct0.add(calculationResult);
                    }
                });
                workerThread.start();
                workerThread.join();
                int resultCalculateProduct0 = queueCalculateProduct0.poll();
                s = resultCalculateProduct0;
                operationCount++;
            }
        }
        System.out.println(operationCount);
    }

    public static int calculateProduct(int s, int q) {
        return s * q;
    }
}