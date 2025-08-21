import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_loop_iterations / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i <= (int) Math.sqrt(n); i++) {
                coef[i - 1] = n / i - n / (i + 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += coef[i];
        }
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[k + 1][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int cumulative_sum = 0;
                for (int divisor_index = 0; divisor_index < n; divisor_index++) {
                    cumulative_sum += dp[i - 1][divisor_index];
                    cumulative_sum %= mod;
                }
                dp[i][j] = coef[j] * cumulative_sum;
                dp[i][j] %= mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}