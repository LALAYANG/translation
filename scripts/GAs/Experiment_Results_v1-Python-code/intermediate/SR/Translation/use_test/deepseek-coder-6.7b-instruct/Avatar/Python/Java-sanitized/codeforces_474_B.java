import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] indices = new int[m];
        for (int i = 0; i < m; i++) {
            indices[i] = scanner.nextInt();
        }
        int result = calculateValue(numbers, indices);
        for (int index : indices) {
            System.out.println(result);
        }
    }

    public static int sumNumbers(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiplyNumbers(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int addNumbers(int r, int constantValue) {
        return sumNumbers(r, constantValue);
    }

    public static int calculateValue(int[] numbers, int[] indices) {
        int r = 1;
        for (int inputNumber : numbers) {
            int initialValue = r;
            r = multiplyNumbers(initialValue, inputNumber);
        }
        return r;
    }
}