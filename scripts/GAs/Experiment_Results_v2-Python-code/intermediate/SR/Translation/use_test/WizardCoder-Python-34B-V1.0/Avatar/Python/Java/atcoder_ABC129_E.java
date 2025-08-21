```java
public class Main {
    public static void main(String[] args) {
        int mod = (int) (1e9 + 7);
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        int n = l.length();
        int[][] dp = new int[n + 1][2];
        int MagicNumberFour = 21;
        int MagicNumberTwo = 703;
        int MagicNumberThree = 432;
        int MagicNumberOne = 960;
        int MagicNumberFive = 841;
        int MagicNumberSix = 372;
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            if ((MagicNumberFive & MagicNumberSix) != 0) {
                if ((MagicNumberThree & MagicNumberOne) != 0) {
                    if (l.charAt(i) == '0') {
                        dp[i + 1][0] += dp[i][0];
                        dp[i + 1][1] += dp[i][1] * 3;
                    } else {
                        dp[i + 1][0] += dp[i][0] * 2;
                        dp[i + 1][1] += dp[i][0];
                        dp[i + 1][1] += dp[i][1] * 3;
                    }
                }
            }
            dp[i + 1][0] %= mod;
            dp[i + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}
```

Test input:
1111111111111111111

Expected output:
162261460 
