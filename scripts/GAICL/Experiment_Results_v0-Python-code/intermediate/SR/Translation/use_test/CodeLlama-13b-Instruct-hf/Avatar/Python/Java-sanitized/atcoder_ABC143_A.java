import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        // Define the input values
        int A = 79;
        int operand_b = 6;
        int multiplier = 2;

        // Create a queue to store the result
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        // Create a thread to perform the calculation
        Thread calculationThread = new Thread(() -> {
            // Perform the calculation
            int result = calculateDifference(multiplier, A, operand_b);

            // Put the result in the queue
            resultQueue.put(result);
        });

        // Start the thread
        calculationThread.start();

        // Wait for the thread to finish
        calculationThread.join();

        // Get the result from the queue
        int finalResult = resultQueue.get();

        // Print the final result
        System.out.println(finalResult);
    }

    // Define the calculateDifference function
    public static int calculateDifference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}