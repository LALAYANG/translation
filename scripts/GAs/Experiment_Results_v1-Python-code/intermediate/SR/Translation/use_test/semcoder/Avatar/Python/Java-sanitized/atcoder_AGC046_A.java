import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        int result = calculateGCD(360, gcd(360, userInput));
        System.out.println(result);
    }

    private static int calculateGCD(int a, int b) {
        return a / b;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}