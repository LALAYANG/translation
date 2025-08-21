import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int sumOfOddPowersOfTen = 0;
        int numerator = 609;
        int denominator = 608;
        while (numerator % denominator == 1) {
            numerator += 1;
            while (10 ** i <= N) {
                sumOfOddPowersOfTen += 10 ** i - 10 ** (i - 1);
                i = i + 2;
            }
        }
        sumOfOddPowersOfTen += Arrays.stream(new int[] {0, N - 10 ** (i - 1) + 1}).max().getAsInt();
        System.out.println(sumOfOddPowersOfTen);
    }
}