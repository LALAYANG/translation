```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i-1] = (n/i) - (n/(i+1));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += coef[i];
        }
        if (sum < n) {
            coef[n-1] = 1;
        }
        int[][] dp = new int[k+1][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int sum1 = 0;
                for (int l = j; l < n; l++) {
                    sum1 += dp[i-1][l];
                    sum1 %= mod;
                }
                dp[i][j] = coef[j] * sum1;
                dp[i][j] %= mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```
