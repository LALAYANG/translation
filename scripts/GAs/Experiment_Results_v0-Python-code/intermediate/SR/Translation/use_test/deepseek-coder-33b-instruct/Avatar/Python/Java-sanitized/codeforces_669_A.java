import java.util.Arrays;
import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = scanner.nextInt();
        System.out.println((calculateTtest(numInput, 2) + 1) / 3);
    }

    public static int calculateTtest(int a, int b) {
        return multiply3647(a, b);
    }

    public static int multiply3647(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int[] shuffle(int[] array) {
        Arrays.sort(array);
        return array;
    }
}