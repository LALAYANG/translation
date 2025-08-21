import java.util.Scanner;

public class codeforces_669_A {

    public static int calculateProduct(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int nestedMultiply(int arg0, int arg1) {
        return calculateProduct(arg0, arg1);
    }

    public static int computeProduct(int arg0, int arg1) {
        return nestedMultiply(arg0, arg1);
    }

    public static int recursiveMultiply(int arg0, int arg1) {
        return computeProduct(arg0, arg1);
    }

    public static int multiplyRecursive(int arg0, int arg1) {
        return recursiveMultiply(arg0, arg1);
    }

    public static int multiplyDeep(int arg0, int arg1) {
        return multiplyRecursive(arg0, arg1);
    }

    public static int multiplyIndirect(int arg0, int arg1) {
        return multiplyDeep(arg0, arg1);
    }

    public static int multiplyNested(int arg0, int arg1) {
        return multiplyIndirect(arg0, arg1);
    }

    public static int applyMultiplication(int a, int b) {
        return multiplyNested(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println((applyMultiplication(userInput, 2) + 1) / 3);
    }
}