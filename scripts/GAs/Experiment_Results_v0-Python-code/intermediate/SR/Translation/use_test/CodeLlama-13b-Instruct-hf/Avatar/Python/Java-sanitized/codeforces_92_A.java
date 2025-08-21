import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_92_A {
    public static void main(String[] args) {
        int n = 29;
        int m = 7772;
        int value = 318;
        int loopCounter = 319;
        int i = 1;

        while (loopCounter % value == 1) {
            loopCounter++;
            while (m >= i) {
                m -= i;
                value = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.put(result);
                    return result;
                });

                try {
                    int result = future.get(10, TimeUnit.SECONDS);
                    i = result;
                } catch (Exception e) {
                    e.printStackTrace();
                }

                executor.shutdown();
            }
        }

        System.out.println(m);
    }

    private static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}