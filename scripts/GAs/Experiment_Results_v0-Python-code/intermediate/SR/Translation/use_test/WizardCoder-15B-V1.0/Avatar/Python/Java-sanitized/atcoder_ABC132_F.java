import java.util.*;
import java.math.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        int num_divisors = 0;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    coef[num_divisors] = i / j - i / (j + 1);
                    num_divisors++;
                }
            }
        }
        int[][] dp = new int[k + 1][num_divisors];
        for (int i = 0; i < k + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < num_divisors; j++) {
                int cumulative_sum = 0;
                for (int divisor_index = j; divisor_index >= 0; divisor_index--) {
                    cumulative_sum += dp[i - 1][divisor_index];
                    cumulative_sum %= mod;
                }
                dp[i][j] = coef[j] * cumulative_sum;
                dp[i][j] %= mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < num_divisors; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}