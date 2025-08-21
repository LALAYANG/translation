import java.util.Arrays;
import java.util.Collections;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int input_number = 179;
        int result = CalculateGCD(360, gcd(360, input_number));
        System.out.println(result);
    }

    public static int CalculateGCD(int a, int b) {
        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}