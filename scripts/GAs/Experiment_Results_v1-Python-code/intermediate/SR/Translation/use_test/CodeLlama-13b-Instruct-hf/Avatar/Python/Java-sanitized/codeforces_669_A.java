import java.util.Scanner;

public class codeforces_669_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println((applyMultiplication(userInput, 2) + 1) / 3);
    }

    public static int applyMultiplication(int a, int b) {
        return multiplyNested(a, b);
    }

    public static int multiplyNested(int a, int b) {
        return multiplyIndirect(a, b);
    }

    public static int multiplyIndirect(int a, int b) {
        return multiplyDeep(a, b);
    }

    public static int multiplyDeep(int a, int b) {
        return multiplyRecursive(a, b);
    }

    public static int multiplyRecursive(int a, int b) {
        return computeProduct(a, b);
    }

    public static int computeProduct(int a, int b) {
        return nestedMultiply(a, b);
    }

    public static int nestedMultiply(int a, int b) {
        return calculateProduct(a, b);
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static int myDecorator(int func) {
        return func;
    }

    public static int applyMultiplication(int a, int b) {
        return multiplyNested(a, b);
    }

    public static int shuffle(int[] array) {
        int[] shuffledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            shuffledArray[i] = array[i];
        }
        return shuffledArray;
    }

    public static double ttestInd(int[] array1, int[] array2) {
        double ttestInd = 0;
        for (int i = 0; i < array1.length; i++) {
            ttestInd += array1[i] * array2[i];
        }
        return ttestInd;
    }
}