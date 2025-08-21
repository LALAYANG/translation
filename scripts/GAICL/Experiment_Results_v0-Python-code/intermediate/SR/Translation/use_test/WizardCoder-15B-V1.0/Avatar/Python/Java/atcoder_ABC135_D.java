```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 13; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][input.charAt(0) - '0'] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 10; k++) {
                    dp[i][(j * 10 + k) % 13] += dp[i - 1][j];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 13; i++) {
            ans += dp[n - 1][i];
        }
        System.out.println(ans);
    }
}
```
