import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int remainder = Integer.parseInt(args[1]);
        int currentValue = 849;
        int divisor = 848;
        int operand = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread threadSumOperands0 = new Thread(() -> {
            int result = sumOperands(operand, currentValue);
            resultQueue.put(result);
        });
        threadSumOperands0.start();
        threadSumOperands0.join();
        int sumResult = resultQueue.get();
        currentValue = sumResult;

        while (remainder >= i) {
            remainder = remainder - i;
            i = i % n + 1;
        }
        System.out.println(remainder);
    }

    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }
}