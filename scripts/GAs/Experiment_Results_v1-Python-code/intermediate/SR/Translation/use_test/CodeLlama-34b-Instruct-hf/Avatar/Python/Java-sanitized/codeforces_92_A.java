import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentValue = scanner.nextInt();
        int divisor = 848;
        int remainder = 0;
        int i = 1;
        while (currentValue % divisor == 1) {
            int operand = 1;
            Queue<Integer> resultQueue = new Queue<>();

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = sumOperands(operand, currentValue);
                    resultQueue.add(result);
                }
            });
            thread.start();
            thread.join();
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