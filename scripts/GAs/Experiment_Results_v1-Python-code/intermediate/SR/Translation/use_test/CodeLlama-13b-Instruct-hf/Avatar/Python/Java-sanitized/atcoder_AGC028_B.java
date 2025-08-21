import java.util.concurrent.Thread;
import java.util.concurrent.Queue;
import java.util.Arrays;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        // Create a new thread for the calculateValue function
        Thread calculateValueThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Calculate the value of the operands
                int operandOne = 7;
                int operandTwo = 10;
                int operandThree = 9;
                int result = calculateValue(operandOne, operandThree, operandTwo);

                // Add the result to the queue
                Queue<Integer> queue = new Queue<>();
                queue.add(result);
            }
        });

        // Start the thread and wait for it to finish
        calculateValueThread.start();
        try {
            calculateValueThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the result from the queue
        int result = queue.poll();

        // Print the result
        System.out.println(result);
    }

    private static int calculateValue(int operandOne, int operandThree, int operandTwo) {
        return (int) Math.pow(operandTwo, operandThree) + operandOne;
    }
}