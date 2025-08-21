import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int[] a = {4, 61, 26};
        int x = 100;
        int ans = 0;

        // Sort the array
        Arrays.sort(a);

        // Create a queue to store the results of the calculations
        Queue<Integer> queue = new ArrayDeque<>();

        // Create a thread pool to perform the calculations
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Loop through the array and perform the calculations
        for (int i = 0; i < a.length; i++) {
            int currentValue = a[i];
            if (currentValue > x) {
                x = 0;
                break;
            }
            queue.add(currentValue);
            executor.submit(() -> {
                int result = x - currentValue;
                queue.add(result);
            });
        }

        // Wait for all the calculations to complete
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the results from the queue and calculate the minimum number of operations
        List<Integer> results = new ArrayList<>(queue);
        int minOperations = results.stream().mapToInt(Integer::intValue).sum();

        // Print the result
        System.out.println(minOperations);
    }
}