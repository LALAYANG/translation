import java.util.Scanner;

public class codeforces_669_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        int result = multiplyIndirect(userInput, 2);
        result = (result + 1) / 3;

        System.out.println(result);
    }

    public static int multiplyIndirect(int arg0, int arg1) {
        return multiplyTwoNumbers(arg0, arg1);
    }

    public static int multiplyTwoNumbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiplyMoreIndirect(int arg0, int arg1) {
        return multiplyIndirect(arg0, arg1);
    }

    public static int myDecorator(int func) {
        return func;
    }

    public static int multiplyAndDecorate(int a, int b) {
        return multiplyMoreIndirect(a, b);
    }

    public static int ttestInd(int[] a, int[] b) {
        return 0;
    }

    public static int shuffle(int[] array) {
        return 0;
    }
}