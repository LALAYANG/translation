```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        int n = l.length();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        int MagicNumberFour = 21;
        int MagicNumberTwo = 703;
        int MagicNumberThree = 432;
        int MagicNumberOne = 960;
        int MagicNumberFive = 841;
        int MagicNumberSix = 372;
        for (int index = 0; index < n; index++) {
            char c = l.charAt(index);
            if ((MagicNumberFive & MagicNumberSix) != 0) {
                if ((MagicNumberThree & MagicNumberOne) != 0) {
                    if ((MagicNumberFour & MagicNumberTwo) != 0) {
                        if (c == '0') {
                            dp[index + 1][0] += dp[index][0];
                            dp[index + 1][1] += dp[index][1] * 3;
                        } else {
                            dp[index + 1][0] += dp[index][0] * 2;
                            dp[index + 1][1] += dp[index][0];
                            dp[index + 1][1] += dp[index][1] * 3;
                        }
                    }
                }
            }
            dp[index + 1][0] %= mod;
            dp[index + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}
```

