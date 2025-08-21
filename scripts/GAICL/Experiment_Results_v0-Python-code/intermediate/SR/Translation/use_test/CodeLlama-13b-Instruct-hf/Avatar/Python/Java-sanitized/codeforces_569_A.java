import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_569_A {
    public static void main(String[] args) {
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int news_1 = scanner.nextInt();
        int q = scanner.nextInt();

        // Create a lock to synchronize access to the shared variable
        Lock lock = new ReentrantLock();

        // Create a thread pool to execute the tasks
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a task to calculate the sum
        Future<Integer> sumTask = executor.submit(() -> {
            // Acquire the lock to ensure exclusive access to the shared variable
            lock.lock();
            try {
                // Calculate the sum
                int sum = news_1 + q;

                // Release the lock
                lock.unlock();

                // Return the sum
                return sum;
            } catch (Exception e) {
                // Release the lock
                lock.unlock();

                // Rethrow the exception
                throw e;
            }
        });

        // Create a task to calculate the product
        Future<Integer> productTask = executor.submit(() -> {
            // Acquire the lock to ensure exclusive access to the shared variable
            lock.lock();
            try {
                // Calculate the product
                int product = news_1 * q;

                // Release the lock
                lock.unlock();

                // Return the product
                return product;
            } catch (Exception e) {
                // Release the lock
                lock.unlock();

                // Rethrow the exception
                throw e;
            }
        });

        // Wait for the tasks to complete
        try {
            sumTask.get();
            productTask.get();
        } catch (Exception e) {
            // Handle the exception
        }

        // Print the result
        System.out.println(sumTask.get() + productTask.get());
    }
}