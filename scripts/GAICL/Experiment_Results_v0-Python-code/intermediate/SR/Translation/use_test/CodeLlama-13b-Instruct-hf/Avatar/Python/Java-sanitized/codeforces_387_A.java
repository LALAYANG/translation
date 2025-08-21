import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_387_A {
    public static void main(String[] args) {
        // Create a queue to store the results
        Queue<Integer> queue = new LinkedList<>();

        // Create a lock to synchronize access to the queue
        Lock lock = new ReentrantLock();

        // Create an executor service to run the tasks concurrently
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a task to calculate the difference
        Future<Integer> task1 = executor.submit(() -> {
            // Acquire the lock to ensure exclusive access to the queue
            lock.lock();
            try {
                // Calculate the difference and add it to the queue
                int result = calculateDifference(queue);
                queue.add(result);
            } finally {
                // Release the lock
                lock.unlock();
            }
        });

        // Create a task to calculate the remainder
        Future<Integer> task2 = executor.submit(() -> {
            // Acquire the lock to ensure exclusive access to the queue
            lock.lock();
            try {
                // Calculate the remainder and add it to the queue
                int result = calculateRemainder(queue);
                queue.add(result);
            } finally {
                // Release the lock
                lock.unlock();
            }
        });

        // Wait for the tasks to complete
        try {
            task1.get();
            task2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Print the results
        System.out.println(queue.poll());
    }

    private static int calculateDifference(Queue<Integer> queue) {
        // Calculate the difference and return it
        return queue.poll() - queue.poll();
    }

    private static int calculateRemainder(Queue<Integer> queue) {
        // Calculate the remainder and return it
        return queue.poll() % 1440;
    }
}