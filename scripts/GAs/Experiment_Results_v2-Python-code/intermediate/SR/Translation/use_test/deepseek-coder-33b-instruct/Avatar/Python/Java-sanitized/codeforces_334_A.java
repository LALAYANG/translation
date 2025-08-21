import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_334_A {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int i = 1, j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = calculateSum(incrementValue, sumValue);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int sumResult = resultQueue.take();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
    }

    private static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}