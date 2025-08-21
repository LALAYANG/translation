import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int denominator = 2;
        int numerator_coefficient = 1;
        int result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator);
        int final_result = result_calculate_intermediate_value0;
        int t = 1;
        while (t <= n) {
            final_result -= 2 * t;
            t = t * 2;
        }
        return final_result;
    }

    public static int calculate_intermediate_value(int numerator_coefficient, int n, int denominator) {
        return (numerator_coefficient + n) * n / denominator;
    }
}