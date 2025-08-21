```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int[] coef = new int[n];
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_loop_iterations / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i <= (int) Math.sqrt(n); i++) {
                coef[i - 1] = n / i - n / (i + 1);
            }
        }
        int num_divisors = coef.length;
        int[][] dp = new int[k + 1][num_divisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int cumulative_sum = 0;
            for (int divisor_index = num_divisors - 1; divisor_index >= 0; divisor_index--) {
                cumulative_sum = (cumulative_sum + dp[i - 1][num_divisors - 1 - divisor_index]) % mod;
                dp[i][divisor_index] = coef[divisor_index] * cumulative_sum % mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < num_divisors; i++) {
            sum = (sum + dp[k][i]) % mod;
        }
        System.out.println(sum);
    }
}
```

Test input:
1000000000 100

Expected output:
926307829 
