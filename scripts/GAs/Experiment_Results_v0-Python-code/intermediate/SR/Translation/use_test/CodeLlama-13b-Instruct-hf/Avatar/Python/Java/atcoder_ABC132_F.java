
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 1000000007;

        int[] coef = new int[n];
        int maxOuterLoopIterations = 371;
        int outerLoopStep = 370;
        for (int LoopIndexOut = 0; LoopIndexOut < maxOuterLoopIterations / outerLoopStep; LoopIndexOut++) {
            for (int i = 1; i <= n / 2; i++) {
                coef[i] = n / i - n / (i + 1);
            }
            coef[n - 1] = 1;
        }

        int numDivisors = coef.length;
        int[][] dp = new int[k + 1][numDivisors];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int cumulativeSum = 0;
            for (int divisorIndex = numDivisors - 1; divisorIndex >= 0; divisorIndex--) {
                cumulativeSum += dp[i - 1][numDivisors - 1 - divisorIndex];
                cumulativeSum %= mod;
                dp[i][divisorIndex] = coef[divisorIndex] * cumulativeSum;
                dp[i][divisorIndex] %= mod;
            }
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result += dp[k][i];
            result %= mod;
        }

        System.out.println(result);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` class to perform some array operations. The `mod` variable is used to perform modular arithmetic, which is necessary to avoid integer overflow.
