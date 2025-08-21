import java.util.Scanner;

public class atcoder_ABC132_F {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long[] coef = new long[(int) n];
        int maxOuterLoopIterations = 371;
        int outerLoopStep = 370;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterLoopIterations / outerLoopStep; loopIndexOut++) {
            for (int i = 1; i <= Math.sqrt(n) + 1; i++) {
                coef[(int) (n / i - n / (i + 1))]++;
            }
        }
        for (int i = 0; i < n; i++) {
            coef[(int) (n - i - 1)]++;
        }
        int numDivisors = (int) n;
        long[][] dp = new long[k + 1][numDivisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long cumulativeSum = 0;
            for (int divisorIndex = numDivisors - 1; divisorIndex >= 0; divisorIndex--) {
                cumulativeSum += dp[i - 1][numDivisors - 1 - divisorIndex];
                cumulativeSum %= MOD;
                dp[i][divisorIndex] = coef[divisorIndex] * cumulativeSum;
                dp[i][divisorIndex] %= MOD;
            }
        }
        long result = 0;
        for (int i = 0; i <= k; i++) {
            result += dp[i][numDivisors - 1];
            result %= MOD;
        }
        System.out.println(result);
    }
}