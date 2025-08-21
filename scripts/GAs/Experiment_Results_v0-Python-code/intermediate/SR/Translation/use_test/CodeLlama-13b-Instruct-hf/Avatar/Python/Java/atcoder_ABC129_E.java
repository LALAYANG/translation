
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        // Read input
        String l = args[0];

        // Shuffle the input
        int[] shuffled = shuffle(l);

        // Perform t-test
        double[][] dp = new double[l.length() + 1][2];
        dp[0][0] = 1;
        for (int i = 0; i < l.length(); i++) {
            if (CONDITION_VALUE_2 & CONDITION_VALUE_1) {
                if (THRESHOLD_2 & THRESHOLD_1) {
                    if (l.charAt(i) == '0') {
                        dp[i + 1][0] += dp[i][0];
                        dp[i + 1][1] += dp[i][1] * 3;
                    } else {
                        dp[i + 1][0] += dp[i][0] * 2;
                        dp[i + 1][1] += dp[i][0] * 3;
                        dp[i + 1][1] += dp[i][1] * 3;
                    }
                }
            }
            dp[i + 1][0] %= MODULO_VALUE;
            dp[i + 1][1] %= MODULO_VALUE;
        }
        System.out.println((dp[l.length()][0] + dp[l.length()][1]) % MODULO_VALUE);
    }

    private static int[] shuffle(String l) {
        int[] shuffled = new int[l.length()];
        for (int i = 0; i < l.length(); i++) {
            shuffled[i] = l.charAt(i);
        }
        Random random = new Random();
        for (int i = 0; i < l.length(); i++) {
            int j = random.nextInt(l.length());
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}
```
Note that this code assumes that the input string `l` is a valid string of digits, and that the modulo value `MODULO_VALUE` is a positive integer. If the input string is not a valid string of digits, or if the modulo value is not a positive integer, the code may produce incorrect results.
