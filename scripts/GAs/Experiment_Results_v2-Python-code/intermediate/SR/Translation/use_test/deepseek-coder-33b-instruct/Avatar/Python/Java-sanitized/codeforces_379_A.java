import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_379_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remaining_candles = 0;
        while (candeleIntere > 0 || remaining_candles >= b) {
            candeleIntere += calculateWholeCandles(b, remaining_candles);
            BlockingQueue<Integer> queueCalculateCandleRemainder0 = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                try {
                    queueCalculateCandleRemainder0.put(calculateCandleRemainder(remaining_candles, b));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int remainderCandles = queueCalculateCandleRemainder0.take();
            remaining_candles = remainderCandles;
            s = s + candeleIntere;
            remaining_candles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    private static int calculateCandleRemainder(int remaining_candles, int b) {
        return remaining_candles % b;
    }

    private static int calculateWholeCandles(int b, int remaining_candles) {
        return remaining_candles / b;
    }
}