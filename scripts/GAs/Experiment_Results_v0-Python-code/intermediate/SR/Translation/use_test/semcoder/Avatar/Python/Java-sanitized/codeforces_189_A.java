import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_189_A {
    public static void main(String[] args) {
        // Input parsing and sorting
        int[] arr = new int[]{918, 102, 1327, 1733};
        int totalLength = arr[0];
        java.util.Arrays.sort(arr, 1, 4);

        // Calculate the remainder asynchronously
        Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            int result = calculateRemainder(0, arr[2], totalLength);
            resultQueue.add(result);
        });
        executor.shutdown();

        // Perform calculations based on the remainder
        int remainder = resultQueue.poll();
        int check = remainder;
        if (check >= 0 && check % arr[0] == 0) {
            int count1 = check / arr[0];
            // Update ans
        }

        // Output the result
        System.out.println(0);
    }

    public static int calculateRemainder(int i, int variable718, int totalLength) {
        return totalLength - i * variable718;
    }
}