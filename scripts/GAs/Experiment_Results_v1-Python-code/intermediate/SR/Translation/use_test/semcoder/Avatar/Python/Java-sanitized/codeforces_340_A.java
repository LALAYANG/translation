import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_340_A {
    public static int calculateGreatestCommonDivisor(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter++;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    public static int calculateLeastCommonMultiple(int a, int b) {
        return a * b / calculateGreatestCommonDivisor(a, b);
    }

    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;

        Queue<Integer> queueL0 = new LinkedBlockingQueue<>();

        Thread LThread = new Thread(() -> {
            int result = calculateLeastCommonMultiple(x, y);
            // Perform t-test
            // ttest_ind([3, 13, 19], [80, 22, 61])
            queueL0.add(result);
        });
        LThread.start();
        try {
            LThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int resultL0 = queueL0.poll();
        int lcm = resultL0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}