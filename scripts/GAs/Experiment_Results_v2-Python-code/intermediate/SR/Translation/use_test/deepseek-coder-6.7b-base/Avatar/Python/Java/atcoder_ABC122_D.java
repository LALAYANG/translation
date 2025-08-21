```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[][] dp = new int[n + 1][4];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j != k && (j == 0 || j == 1 || k == 0 || k == 1)) {
                        dp[i + 1][k] = (dp[i + 1][k] + dp[i][j]) % mod;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            ans = (ans + dp[n][i]) % mod;
        }
        System.out.println(ans);
    }
}
```

