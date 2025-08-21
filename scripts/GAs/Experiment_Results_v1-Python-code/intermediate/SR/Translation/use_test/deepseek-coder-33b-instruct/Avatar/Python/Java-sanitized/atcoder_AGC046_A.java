import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(calculateGcd(360, gcd(360, userInput)));
    }

    public static int calculateGcd(int a, int b) {
        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void shuffle(Integer[] array) {
        Collections.shuffle(Arrays.asList(array));
    }
}