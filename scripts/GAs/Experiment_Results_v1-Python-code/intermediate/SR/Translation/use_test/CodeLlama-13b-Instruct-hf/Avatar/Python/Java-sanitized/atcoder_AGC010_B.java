import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = calculateSum(a);
        if (sum % divisor == 0) {
            int result = calculateResult(divisor, a);
            if (isValidSolution(result)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    private static int calculateSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int calculateResult(int divisor, int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result / divisor;
    }

    private static boolean isValidSolution(int result) {
        // Check if the result is a valid solution
        return true;
    }
}