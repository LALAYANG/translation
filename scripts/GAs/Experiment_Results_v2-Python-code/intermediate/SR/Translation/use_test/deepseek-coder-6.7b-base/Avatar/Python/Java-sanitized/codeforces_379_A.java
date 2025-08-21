import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remaining_candles = 0;
        while (candeleIntere > 0 || remaining_candles >= b) {
            candeleIntere += calculate_whole_candles(b, remaining_candles);
            Queue<Integer> queue_calculate_candle_remainder0 = new LinkedBlockingQueue<>();
            Thread thread_calculate_candle_remainder0 = new Thread(() -> {
                int result = calculate_candle_remainder(remaining_candles, b);
                queue_calculate_candle_remainder0.add(result);
            });
            thread_calculate_candle_remainder0.start();
            thread_calculate_candle_remainder0.join();
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
        return remaining_candles / b;
    }
}