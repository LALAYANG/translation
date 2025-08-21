import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class atcoder_AGC002_B {
    public static void main(String[] args) throws Exception {
        // Read input from stdin
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);

        // Create a queue to store the balls
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Create a thread pool to process the balls
        ExecutorService executor = Executors.newFixedThreadPool(N);

        // Create a future to store the result
        Future<Integer> future = executor.submit(() -> {
            // Process the balls
            int ans = 0;
            for (int i = 0; i < N; i++) {
                int x = queue.take();
                int y = queue.take();
                if (x == y) {
                    ans++;
                }
            }
            return ans;
        });

        // Add the balls to the queue
        IntStream.range(0, N).forEach(i -> queue.add(i));

        // Shut down the thread pool
        executor.shutdown();

        // Wait for the future to complete
        int result = future.get(10, TimeUnit.SECONDS);

        // Print the result
        System.out.println(result);
    }
}