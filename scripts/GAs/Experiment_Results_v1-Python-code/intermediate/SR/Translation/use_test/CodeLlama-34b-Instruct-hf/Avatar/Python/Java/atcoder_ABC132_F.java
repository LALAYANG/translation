```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = n / i - n / (i + 1);
        }
        coef[n - 1] = 1;
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][n - 1 - j];
                tmp %= 1000000007;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= 1000000007;
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += dp[k][i];
            result %= 1000000007;
        }
        System.out.println(result);
    }
}
```
Note: The code above uses the modulo operator (`%`) to handle the large numbers. The modulo operator is used to compute the remainder of the division of two numbers, and it is often used in competitive programming to avoid integer overflow. In this case, the modulo operator is used to compute the remainder of the division of the result by 1000000007, which is the modulus used in the problem statement.
