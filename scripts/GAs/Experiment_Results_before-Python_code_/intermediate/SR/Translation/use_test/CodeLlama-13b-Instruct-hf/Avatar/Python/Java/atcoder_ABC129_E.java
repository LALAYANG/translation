```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        String input = scanner.nextLine();
        int n = input.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == '0') {
                dp[i + 1][0] += dp[i][0];
                dp[i + 1][1] += dp[i][1] * 3;
            } else {
                dp[i + 1][0] += dp[i][0] * 2;
                dp[i + 1][1] += dp[i][0];
                dp[i + 1][1] += dp[i][1] * 3;
            }
            dp[i + 1][0] %= mod;
            dp[i + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}
```
This is a solution to the problem in Java. The code first reads the input from the user, and then initializes the dp array with the values 0 and 1 for the first row.

The for loop then iterates over the input string, and for each character in the string, it updates the values in the dp array based on the previous values and the current character.

Finally, the code prints the sum of the values in the dp array modulo 1000000007.

Note that the code uses the `%` operator to perform modulo operations, which is a common way to perform modulo operations in Java.
