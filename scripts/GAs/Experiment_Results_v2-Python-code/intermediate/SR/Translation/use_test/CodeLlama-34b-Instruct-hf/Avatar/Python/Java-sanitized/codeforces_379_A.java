import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remainingCandles = 0;

        while (candeleIntere > 0 || remainingCandles >= b) {
            candeleIntere += calculateWholeCandles(b, remainingCandles);
            Queue<Integer> queueCalculateCandleRemainder = new Queue<>();

            Thread threadCalculateCandleRemainder = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = calculateCandleRemainder(remainingCandles, b);
                    queueCalculateCandleRemainder.add(result);
                }
            });
            threadCalculateCandleRemainder.start();
            threadCalculateCandleRemainder.join();
            int remainderCandles = queueCalculateCandleRemainder.poll();
            remainingCandles = remainderCandles;
            s = s + candeleIntere;
            remainingCandles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    private static int calculateWholeCandles(int b, int remainingCandles) {
        // TODO: Implement this method
        return 0;
    }

    private static int calculateCandleRemainder(int remainingCandles, int b) {
        // TODO: Implement this method
        return 0;
    }
}