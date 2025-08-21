import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int result = multiplyAndDecorate(userInput, 2);
        System.out.println((result + 1) / 3);
    }

    public static int multiplyAndDecorate(int a, int b) {
        return multiplyIndirect(a, b);
    }

    public static int multiplyIndirect(int a, int b) {
        return multiplyTwoNumbers(a, b);
    }

    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }
}