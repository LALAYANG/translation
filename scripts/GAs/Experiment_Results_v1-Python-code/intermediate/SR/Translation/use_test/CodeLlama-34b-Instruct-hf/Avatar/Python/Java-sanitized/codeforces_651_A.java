import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = calculateSum(firstNumber, secondNumber);
        System.out.println(result);
    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        return result;
    }
}