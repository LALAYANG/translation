```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = n / i - n / (i + 1);
        }
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < nn; j++) {
                int tmp = 0;
                for (int l = j; l < nn; l++) {
                    tmp += dp[i - 1][l];
                    tmp %= mod;
                }
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < nn; i++) {
            ans += dp[k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```
