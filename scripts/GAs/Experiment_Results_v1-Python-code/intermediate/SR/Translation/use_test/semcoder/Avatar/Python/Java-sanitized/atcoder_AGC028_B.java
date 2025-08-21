import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC028_B {
    public static int calculateValue(int operandOne, int operandThree, int operandTwo) {
        return (int) Math.pow(operandTwo, operandThree) + operandOne;
    }

    public static void main(String[] args) {
        int operandOne = 7;
        int operandTwo = 10;
        int operandThree = 9;

        Queue<Integer> queue = new LinkedBlockingQueue<>();
        Thread calculationThread = new Thread(() -> {
            int result = calculateValue(operandOne, operandThree, operandTwo);
            queue.add(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int MOD = queue.poll();

        // Rest of the Java code goes here
    }
}