import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_input = scanner.nextInt();
        int result = (calculate_ttest(num_input, 2) + 1) / 3;
        System.out.println(result);
    }

    private static int calculate_ttest(int a, int b) {
        // Simulating the t-test calculation
        return multiply_3647(a, b);
    }

    private static int multiply_3647(int a, int b) {
        return a * b;
    }
}