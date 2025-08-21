import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
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
            threadSumOperands0.join();
            int sumResult = resultQueue.poll();
            currentValue = sumResult;
            while (remainder >= i) {
                remainder = remainder - i;
                i = i % n + 1;
            }
        }
        System.out.println(remainder);
    }

    public static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }
}