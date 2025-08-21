import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remaining_candles = 0;
        while (candeleIntere > 0 || remaining_candles >= b) {
            candeleIntere += calculate_whole_candles(b, remaining_candles);
            int remainder_candles = calculate_candle_remainder(remaining_candles, b);
            remaining_candles = remainder_candles;
            s += candeleIntere;
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