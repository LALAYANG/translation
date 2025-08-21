
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;

        int[] coef = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        coef[n / 2] = 1;

        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += dp[k][i];
            result %= mod;
        }

        System.out.println(result);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `mod` variable to perform modular arithmetic. The `coef` array is used to store the coefficients of the polynomial, and the `dp` array is used to store the values of the polynomial at different points. The `result` variable is used to store the final result, which is the sum of the values of the polynomial at the `k`th point.
