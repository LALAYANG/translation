import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_379_A {
    public static int calculateCandleRemainder(int remainingCandles, int b) {
        return remainingCandles % b;
    }

    public static int calculateWholeCandles(int b, int remainingCandles) {
        // Perform t-test for demonstration purposes
        // ttest_ind([77, 29, 11], [90, 35, 89])
        return remainingCandles / b;
    }

    public static void main(String[] args) {
        int candeleIntere = 3;
        int b = 2;
        int s = 0;
        int remainingCandles = 0;

        while (candeleIntere > 0 || remainingCandles >= b) {
            candeleIntere += calculateWholeCandles(b, remainingCandles);

            Queue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

            executor.execute(() -> {
                int result = calculateCandleRemainder(remainingCandles, b);
                queue.add(result);
            });

            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int remainderCandles = queue.poll();
            remainingCandles = remainderCandles;
            s += candeleIntere;
            remainingCandles += candeleIntere % b;
            candeleIntere /= b;
        }

        System.out.println(s);
    }
}