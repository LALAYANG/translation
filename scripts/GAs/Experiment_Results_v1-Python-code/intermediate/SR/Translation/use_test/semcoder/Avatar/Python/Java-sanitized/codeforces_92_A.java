import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }

    public static void main(String[] args) {
        int n = 29;
        int remainder = 7772;
        int currentValue = 849;
        int divisor = 848;

        while (currentValue % divisor == 1) {
            int operand = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread threadSumOperands0 = new Thread(() -> {
                int result = sumOperands(operand, currentValue);
                resultQueue.add(result);
            });
            threadSumOperands0.start();
            try {
                threadSumOperands0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            currentValue = sumResult;

            while (remainder >= n) {
                remainder -= n;
                n = (n - 1) % n + 1;
            }
        }
        System.out.println(remainder);
    }
}