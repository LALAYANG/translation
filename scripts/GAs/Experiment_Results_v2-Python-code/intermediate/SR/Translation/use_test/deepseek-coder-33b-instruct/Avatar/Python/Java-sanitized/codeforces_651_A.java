import java.util.Arrays;
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.max(sumInputs(x, secondInput) - 3 + ((secondInput - x) % 3 > 0 ? 1 : 0), 0));
        scanner.close();
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }
}