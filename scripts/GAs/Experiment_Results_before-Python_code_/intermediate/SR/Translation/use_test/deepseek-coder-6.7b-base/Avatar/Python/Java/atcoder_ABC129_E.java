
```

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                dp[i + 1][0] = dp[i][0];
                dp[i + 1][1] = dp[i][1] * 3;
            } else {
                dp[i + 1][0] = dp[i][0] * 2;
                dp[i + 1][1] = dp[i][0] + dp[i][1] * 3;
            }
            dp[i + 1][0] %= mod;
            dp[i + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}


```

