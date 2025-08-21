import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        // Get the inputs
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        String S = args[2];
        String T = args[3];

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a queue to store the results
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        // Create a task to increment the counter
        Runnable incrementCounterTask = () -> {
            int counter = 0;
            while (counter <= N * M / 2) {
                if (S.charAt(counter) == T.charAt(counter)) {
                    counter++;
                } else {
                    break;
                }
            }
            resultQueue.add(counter);
        };

        // Submit the task to the thread pool
        Future<Integer> future = executor.submit(incrementCounterTask);

        // Wait for the task to complete
        try {
            future.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        // Get the result from the queue
        int counter = resultQueue.poll();

        // Calculate the greatest common divisor
        int gcd = gcd(N, M);

        // Print the result
        System.out.println(counter == N * M / gcd ? counter : -1);

        // Shut down the thread pool
        executor.shutdown();
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}