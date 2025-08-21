import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        int input_number = 179;
        System.out.println(calculateGCD(360, gcd(360, input_number)));
    }

    @my_decorator
    public static int calculateGCD(int a, int b) {
        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void my_decorator(int[] arr) {
        Collections.shuffle(Arrays.asList(arr));
    }
}