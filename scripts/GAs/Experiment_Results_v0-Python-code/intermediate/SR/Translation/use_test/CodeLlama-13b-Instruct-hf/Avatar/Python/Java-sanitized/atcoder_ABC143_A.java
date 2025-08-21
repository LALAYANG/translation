import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        // Define the input values
        int A = 79;
        int operand_b = 6;
        int multiplier = 2;

        // Define the result queue
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        // Define the calculation function
        Runnable calculationFunction = () -> {
            int result = calculateDifference(multiplier, A, operand_b);
            resultQueue.put(result);
        };

        // Create a thread pool and submit the calculation function
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(calculationFunction);

        // Wait for the result to be available
        try {
            int result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
        }

        // Shut down the thread pool
        executorService.shutdown();
    }

    private static int calculateDifference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}