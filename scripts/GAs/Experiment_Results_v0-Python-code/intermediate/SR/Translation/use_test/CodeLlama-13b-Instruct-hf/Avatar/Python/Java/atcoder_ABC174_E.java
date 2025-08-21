
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Read input
        String[] input = args[0].split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] lis = Arrays.stream(input[2].split(" ")).mapToInt(Integer::parseInt).toArray();

        // Initialize variables
        int a = 1;
        int b = lis.length;
        int ans = b;

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a blocking queue to store the mid result
        BlockingQueue<Integer> midQueue = new LinkedBlockingQueue<>();

        // Create a callable task to calculate the mid
        Callable<Integer> calculateMidTask = () -> {
            int mid = (a + b) / 2;
            midQueue.put(mid);
            return mid;
        };

        // Create a callable task to check if the mid is valid
        Callable<Boolean> checkMidTask = () -> {
            int mid = midQueue.take();
            return Func_check_0(lis, k, mid);
        };

        // Submit the tasks to the thread pool
        Future<Integer> midFuture = executor.submit(calculateMidTask);
        Future<Boolean> checkFuture = executor.submit(checkMidTask);

        // Wait for the tasks to complete
        try {
            midFuture.get();
            checkFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Get the mid result and check if it is valid
        int mid = midQueue.take();
        if (checkFuture.get()) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }

        // Print the final answer
        System.out.println(ans);

        // Shutdown the thread pool
        executor.shutdown();
    }

    // Function to check if the mid is valid
    public static boolean Func_check_0(int[] lis, int k, int mid) {
        int count = 0;
        for (int i : lis) {
            if (i % mid == 0) {
                count++;
            }
            count -= i / mid;
        }
        return count >= 0;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread pool and a blocking queue to store the mid result. It also uses the `java.util.stream` package to convert the input string to an array of integers.
