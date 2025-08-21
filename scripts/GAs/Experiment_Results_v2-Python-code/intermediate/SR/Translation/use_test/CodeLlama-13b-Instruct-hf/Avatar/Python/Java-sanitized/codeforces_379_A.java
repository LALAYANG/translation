import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        int candeleIntere = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int s = 0;
        int remainingCandles = 0;
        while (candeleIntere > 0 || remainingCandles >= b) {
            candeleIntere += calculateWholeCandles(b, remainingCandles);
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            Thread thread = new Thread(() -> {
                int result = calculateCandleRemainder(remainingCandles, b);
                queue.put(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int remainderCandles = queue.take();
            remainingCandles = remainderCandles;
            s = s + candeleIntere;
            remainingCandles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    private static int calculateWholeCandles(int b, int remainingCandles) {
        return remainingCandles / b;
    }

    private static int calculateCandleRemainder(int remainingCandles, int b) {
        return remainingCandles % b;
    }
}