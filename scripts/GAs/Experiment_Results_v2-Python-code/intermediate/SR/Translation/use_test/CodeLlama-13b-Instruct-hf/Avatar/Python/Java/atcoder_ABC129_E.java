
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
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
        for (int index = 0; index < n; index++) {
            if ((MagicNumberFive & MagicNumberSix) != 0) {
                if ((MagicNumberThree & MagicNumberOne) != 0) {
                    if ((MagicNumberFour & MagicNumberTwo) != 0) {
                        if (l.charAt(index) == '0') {
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
Note that the code uses the `Scanner` class to read input from the user, and the `String` class to represent the input string. The `charAt` method is used to access the characters in the string. The `int` data type is used for the variables that represent the magic numbers and the modulus. The `System.out.println` method is used to print the result.
