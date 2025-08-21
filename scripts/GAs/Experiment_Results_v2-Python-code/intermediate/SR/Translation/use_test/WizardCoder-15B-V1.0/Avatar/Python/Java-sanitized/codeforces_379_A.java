import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        int candeleIntere, b;
        candeleIntere = 3;
        b = 2;
        int s = 0;
        int remaining_candles = 0;
        while (candeleIntere > 0 || remaining_candles >= b) {
            candeleIntere += calculate_whole_candles(b, remaining_candles);
            Queue<Integer> queue_calculate_candle_remainder0 = new LinkedList<>();

            class calculate_candle_remainder_thread implements Runnable {
                public void run() {
                    int result = calculate_candle_remainder(remaining_candles, b);
                    queue_calculate_candle_remainder0.offer(result);
                }
            }
            Thread thread_calculate_candle_remainder0 = new Thread(new calculate_candle_remainder_thread());
            thread_calculate_candle_remainder0.start();
            try {
                thread_calculate_candle_remainder0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int remainder_candles = queue_calculate_candle_remainder0.poll();
            remaining_candles = remainder_candles;
            s = s + candeleIntere;
            remaining_candles += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }

    public static int calculate_candle_remainder(int remaining_candles, int b) {
        return remaining_candles % b;
    }

    public static int calculate_whole_candles(int b, int remaining_candles) {
        ttest_ind([77, 29, 11], [90, 35, 89]);
        return remaining_candles / b;
    }
}