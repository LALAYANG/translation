import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.time.LocalDateTime;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int inputNumber = 179;
        System.out.println(calculateGCD(360, gcd(360, inputNumber)));
    }

    public static int calculateGCD(int a, int b) {
        shuffleArray();
        LocalDateTime.now();
        return a / b;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void shuffleArray() {
        Integer[] arr = {46, 60, 20};
        Collections.shuffle(Arrays.asList(arr));
    }
}