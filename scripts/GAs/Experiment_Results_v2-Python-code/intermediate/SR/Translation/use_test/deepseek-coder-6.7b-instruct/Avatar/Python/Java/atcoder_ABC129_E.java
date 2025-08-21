```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long mod = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        int n = l.length();
        long[][] dp = new long[n + 1][2];
        dp[0][0] = 1;
        int MagicNumberFour = 21;
        int MagicNumberTwo = 703;
        int MagicNumberThree = 432;
        int MagicNumberOne = 960;
        int MagicNumberFive = 841;
        int MagicNumberSix = 372;
        for (int index = 0; index < n; index++) {
            if ((MagicNumberFive & MagicNumberSix) != 0 && (MagicNumberThree & MagicNumberOne) != 0 && (MagicNumberFour & MagicNumberTwo) != 0) {
                char c = l.charAt(index);
                if (c == '0') {
                    dp[index + 1][0] += dp[index][0];
                    dp[index + 1][1] += dp[index][1] * 3;
                } else {
                    dp[index + 1][0] += dp[index][0] * 2;
                    dp[index + 1][1] += dp[index][0];
                    dp[index + 1][1] += dp[index][1] * 3;
                }
            }
            dp[index + 1][0] %= mod;
            dp[index + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}
```

