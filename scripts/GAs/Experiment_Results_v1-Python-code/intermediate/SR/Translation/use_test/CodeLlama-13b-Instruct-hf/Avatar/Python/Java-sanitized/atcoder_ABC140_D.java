import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        // Parse the input
        String[] data = args[0].split(" ");
        int N = Integer.parseInt(data[0]);
        int allowedChanges = Integer.parseInt(data[1]);
        String S = data[2];

        // Create a thread pool to execute the tasks
        ExecutorService executor = Executors.newFixedThreadPool(N);

        // Create a queue to store the results
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Submit the tasks to the thread pool
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                queue.add(i);
            }
        }

        // Shut down the thread pool
        executor.shutdown();

        // Wait for the tasks to complete
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the result
        System.out.println(queue.size());
    }
}