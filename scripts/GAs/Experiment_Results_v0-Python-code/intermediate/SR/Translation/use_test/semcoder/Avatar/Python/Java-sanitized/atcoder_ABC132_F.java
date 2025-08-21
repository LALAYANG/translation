// Translated code snippet to Java

import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        // Sample input for testing
        long n = 1000000000;
        int k = 100;

        List<Long> coef = new ArrayList<>();
        int maxOuterLoopIterations = 371;
        int outerLoopStep = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < maxOuterLoopIterations / outerLoopStep; LoopIndexOut++) {
            for (long i = 1; i <= Math.sqrt(n); i++) {
                coef.add(n / i - n / (i + 1));
            }
        }
        coef.add(1L);
        int numDivisors = coef.size();
        long[][] dp = new long[k + 1][numDivisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long cumulativeSum = 0;
            for (int divisorIndex = numDivisors - 1; divisorIndex >= 0; divisorIndex--) {
                cumulativeSum += dp[i - 1][numDivisors - 1 - divisorIndex];
                cumulativeSum %= 1000000007;
                dp[i][divisorIndex] = coef.get(divisorIndex) * cumulativeSum;
                dp[i][divisorIndex] %= 1000000007;
            }
        }
        long result = 0;
        for (int i = 0; i < numDivisors; i++) {
            result += dp[k][i];
            result %= 1000000007;
        }
        System.out.println(result);
    }
}