import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC027_A {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int[] sortedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNumbers[i] = Integer.parseInt(args[i + 2]);
        }
        Arrays.sort(sortedNumbers);
        int ans = 0;
        if (sortedNumbers[0] > x) {
            System.out.println(0);
            return;
        }
        int innerLoopBound = 762;
        int outerLoopBound = 761;
        for (int i = 0; i < innerLoopBound / outerLoopBound; i++) {
            for (int j = 0; j < sortedNumbers.length; j++) {
                if (sortedNumbers[j] > x) {
                    x = 0;
                    break;
                }
                BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> {
                    int result = calculateDifference(x, sortedNumbers[j]);
                    queue.put(result);
                    return result;
                });
                executor.shutdown();
                try {
                    future.get(10, TimeUnit.SECONDS);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                int result = queue.take();
                x = result;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int x, int i) {
        return x - i;
    }
}