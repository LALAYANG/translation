import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_369_B {
    public static void main(String[] args) throws Exception {
        // Read input
        String[] input = args[0].split(" ");
        int totalCount = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = Integer.parseInt(input[2]);
        int r = Integer.parseInt(input[3]);
        int sa = Integer.parseInt(input[4]);
        int sk = Integer.parseInt(input[5]);

        // Create a queue to store the results
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Create a runnable task to calculate the values
        Runnable task = () -> {
            // Calculate the values
            int[] values = calculateValues(getNumbers, k, totalCount, sk, sa);

            // Add the values to the queue
            queue.add(values);
        };

        // Submit the task to the thread pool
        Future<Integer> future = executor.submit(task);

        // Wait for the task to complete
        future.get();

        // Get the results from the queue
        int[] results = queue.toArray(new int[queue.size()]);

        // Print the results
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    // Function to calculate the values
    public static int[] calculateValues(int[] getNumbers, int k, int totalCount, int sk, int sa) {
        int[] values = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            values[i] = getNumbers(k, sk) + getNumbers(totalCount - k, sa - sk);
        }
        return values;
    }

    // Function to get the numbers
    public static int[] getNumbers(int num, int t) {
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = t // num + 1 if i in range(t % num) else t // num;
        }
        return numbers;
    }
}