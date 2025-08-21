import java.util.Scanner;
import static java.lang.Math.gcd;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int result = gcd(360, userInput);
        System.out.println(result);
    }
}