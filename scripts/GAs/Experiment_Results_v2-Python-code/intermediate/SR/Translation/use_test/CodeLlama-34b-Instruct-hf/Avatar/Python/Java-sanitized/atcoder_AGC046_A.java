import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int gcd = gcd(360, inputNumber);
        System.out.println(CalculateGCD(360, gcd));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int CalculateGCD(int a, int b) {
        return a / b;
    }
}