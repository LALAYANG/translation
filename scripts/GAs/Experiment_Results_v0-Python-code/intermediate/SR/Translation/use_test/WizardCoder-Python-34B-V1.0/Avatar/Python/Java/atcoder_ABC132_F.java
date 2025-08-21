```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int[] coef = new int[n + 1];
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_loop_iterations / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i <= (int) Math.sqrt(n); i++) {
                coef[i] = n / i - n / (i + 1);
            }
        }
        int[] dp = new int[k + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int cumulative_sum = 0;
            for (int divisor_index = coef.length - 1; divisor_index >= 0; divisor_index--) {
                cumulative_sum += dp[i - 1][coef.length - 1 - divisor_index];
                cumulative_sum %= mod;
                dp[i][divisor_index] = coef[divisor_index] * cumulative_sum;
                dp[i][divisor_index] %= mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < coef.length; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}
``` 
