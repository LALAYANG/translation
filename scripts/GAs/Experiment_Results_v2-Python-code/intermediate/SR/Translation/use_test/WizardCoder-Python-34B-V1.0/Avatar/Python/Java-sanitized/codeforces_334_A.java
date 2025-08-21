import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int j = n * n;
        int sum_value = 413;
        int divisor_value = 412;
        while (sum_value % divisor_value == 1) {
            int increment_value = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                int result = calculateSum(increment_value, sum_value);
                resultQueue.put(result);
            });
            int sumResult = resultQueue.take();
            sum_value = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i++;
                j--;
            }
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        }
    }

    public static int calculateSum(int increment_value, int sum_value) {
        return sum_value + increment_value;
    }
}