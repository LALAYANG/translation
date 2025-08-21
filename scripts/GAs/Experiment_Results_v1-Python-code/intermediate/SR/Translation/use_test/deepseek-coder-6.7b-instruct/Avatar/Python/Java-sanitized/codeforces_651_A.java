import java.util.Arrays;
import java.util.Scanner;

public class codeforces_651_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(Math.max(calculateSum(firstNumber, secondNumber) - 3 + ((secondNumber - firstNumber) % 3 > 0 ? 1 : 0), 0));
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}