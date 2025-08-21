import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static int calculateSum(int x, int increment) {
        return x + increment;
    }

    public static void main(String[] args) {
        int n = 117422204;
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;

        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter++;
            while (Math.log(n) % 1 != 0) {
                int increment = 1;
                Queue<Integer> sumQueue = new LinkedBlockingQueue<>();

                Thread calculateSumThread = new Thread(() -> {
                    int result = calculateSum(x, increment);
                    sumQueue.add(result);
                });

                calculateSumThread.start();
                calculateSumThread.join();

                int sumResult = sumQueue.poll();
                x = sumResult;
                n -= (int) Math.pow(2, Math.log(n) / Math.log(2));
            }
        }

        // t-test
        // ttest_ind([86, 53, 81], [64, 40, 75])
        System.out.println(x);
    }
}