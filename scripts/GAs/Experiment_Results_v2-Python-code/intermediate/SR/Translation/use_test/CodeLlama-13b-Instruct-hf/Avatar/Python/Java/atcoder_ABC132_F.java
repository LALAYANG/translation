
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[i] = n / i - n / (i + 1);
        }
        for (int i = (int) Math.sqrt(n) + 1; i < n; i++) {
            coef[i] = 1;
        }
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][n - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        System.out.println(Arrays.stream(dp[k]).sum() % mod);
    }
}
```
Note that the `datetime` module is not available in Java, so I have removed that part of the code. Also, the `np` module is not available in Java, so I have replaced it with the `Arrays` class.
