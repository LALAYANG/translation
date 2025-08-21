```java
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int n = l.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        int MagicNumberFour = 21;
        int MagicNumberTwo = 703;
        int MagicNumberThree = 432;
        int MagicNumberOne = 960;
        int MagicNumberFive = 841;
        int MagicNumberSix = 372;
        for (int i = 0; i < n; i++) {
            char c = l.charAt(i);
            if ((MagicNumberFive & MagicNumberSix) != 0) {
                if ((MagicNumberThree & MagicNumberOne) != 0) {
                    if ((MagicNumberFour & MagicNumberTwo) != 0) {
                        if (c == '0') {
                            dp[i + 1][0] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        } else {
                            dp[i + 1][0] += dp[i][0] * 2;
                            dp[i + 1][1] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        }
                    }
                }
            }
            dp[i + 1][0] %= 1000000007;
            dp[i + 1][1] %= 1000000007;
        }
        System.out.println((dp[n][0] + dp[n][1]) % 1000000007);
    }
}
```
Note: The above code uses the modulo operator to handle the large numbers. The modulo operator is used to compute the remainder of the division of two numbers. In this case, the modulo operator is used to compute the remainder of the division of the sum of the two numbers by 10^9 + 7.
