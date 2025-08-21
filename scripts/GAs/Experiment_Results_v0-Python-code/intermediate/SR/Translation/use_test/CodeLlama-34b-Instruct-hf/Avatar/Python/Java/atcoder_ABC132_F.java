```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coef = new int[n];
        int maxOuterLoopIterations = 371;
        int outerLoopStep = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < maxOuterLoopIterations / outerLoopStep; LoopIndexOut++) {
            for (int i = 1; i <= n / i; i++) {
                coef[i - 1] = n / i - n / (i + 1);
            }
            coef[n - 1] = 1;
            int[][] dp = new int[k + 1][n];
            dp[0][0] = 1;
            for (int i = 1; i <= k; i++) {
                int cumulativeSum = 0;
                for (int divisorIndex = n - 1; divisorIndex >= 0; divisorIndex--) {
                    cumulativeSum += dp[i - 1][divisorIndex];
                    cumulativeSum %= 1000000007;
                    dp[i][divisorIndex] = coef[divisorIndex] * cumulativeSum;
                    dp[i][divisorIndex] %= 1000000007;
                }
            }
            System.out.println(dp[k][n - 1]);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
