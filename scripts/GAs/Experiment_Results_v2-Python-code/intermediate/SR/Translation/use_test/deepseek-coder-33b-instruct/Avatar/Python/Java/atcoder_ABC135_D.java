```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int n = S.length();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[n][13];
        for (int idx = 0; idx < n; idx++) {
            if (idx == 0) {
                if (S.charAt(idx) != '?') {
                    dp[idx][S.charAt(idx) - '0'] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[idx][j] += 1;
                    }
                }
            } else {
                if (S.charAt(idx) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[idx][(k * 10 + S.charAt(idx) - '0') % 13] += dp[idx - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[idx][(k * 10 + j) % 13] += dp[idx - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[idx][k] %= mod;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}
```

