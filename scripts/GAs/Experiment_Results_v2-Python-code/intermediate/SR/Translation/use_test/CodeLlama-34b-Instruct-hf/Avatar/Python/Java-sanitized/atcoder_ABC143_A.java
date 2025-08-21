import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operandOne = scanner.nextInt();
        int operandTwo = scanner.nextInt();
        int multiplier = 2;
        Queue<Integer> calculationQueue = new Queue<>();

        Thread threadCalculate0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculate(operandOne, multiplier, operandTwo);
                calculationQueue.add(result);
            }
        });

        threadCalculate0.start();
        threadCalculate0.join();

        int resultCalculate0 = calculationQueue.poll();
        int ans = resultCalculate0;

        if (conditionOne & conditionTwo) {
            if (ans < 0) {
                ans = 0;
            }
        }

        System.out.println(ans);
    }

    public static int calculate(int operandOne, int multiplier, int operandTwo) {
        return operandOne - multiplier * operandTwo;
    }
}