import java.util.Scanner;

public class codeforces_669_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println((multiplyAndDecorate(userInput, 2) + 1) / 3);
    }

    public static int multiplyTwoNumbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiplyIndirect(int arg0, int arg1) {
        return multiplyTwoNumbers(arg0, arg1);
    }

    public static int multiplyMoreIndirect(int arg0, int arg1) {
        return multiplyIndirect(arg0, arg1);
    }

    public static int myDecorator(FunctionalInterface func) {
        return func.decoratedResult();
    }

    @FunctionalInterface
    public interface FunctionalInterface {
        int decoratedResult();
    }

    public static int multiplyAndDecorate(int a, int b) {
        return myDecorator(() -> multiplyMoreIndirect(a, b));
    }
}