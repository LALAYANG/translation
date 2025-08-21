```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = i;
            sum += i;
        }
        int diff = n - sum;
        for (int i = 0; i < diff; i++) {
            coef[i] = 1;
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 0; i <= k; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + coef[i] * dp[k][i]) % mod;
        }
        System.out.println(ans);
    }
}
```
