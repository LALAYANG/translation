import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger k = sc.nextBigInteger();
        BigInteger mod = BigInteger.valueOf(1000000007);
        BigInteger[] coef = new BigInteger[n.intValue()];
        int max_outer_loop_iterations = 371;
        int outer_loop_step = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_loop_iterations / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i <= n.intValue(); i++) {
                coef[i - 1] = n.divide(BigInteger.valueOf(i)).subtract(n.divide(BigInteger.valueOf(i + 1)));
            }
        }
        int num_divisors = coef.length;
        BigInteger[][] dp = new BigInteger[k.intValue() + 1][num_divisors];
        dp[0][0] = BigInteger.valueOf(1);
        for (int i = 1; i <= k.intValue(); i++) {
            BigInteger cumulative_sum = BigInteger.valueOf(0);
            for (int divisor_index = num_divisors - 1; divisor_index >= 0; divisor_index--) {
                cumulative_sum = cumulative_sum.add(dp[i - 1][num_divisors - 1 - divisor_index]);
                cumulative_sum = cumulative_sum.mod(mod);
                dp[i][divisor_index] = coef[divisor_index].multiply(cumulative_sum);
                dp[i][divisor_index] = dp[i][divisor_index].mod(mod);
            }
        }
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 0; i < num_divisors; i++) {
            result = result.add(dp[k.intValue()][i]);
            result = result.mod(mod);
        }
        System.out.println(result);
    }
}