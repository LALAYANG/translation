```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = sc.nextInt();
            timeValue[i][1] = sc.nextInt();
        }
        int[][] dp = new int[N + 1][T + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= T; j++) {
                if (timeValue[i][0] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], timeValue[i][1] + dp[i - 1][j - timeValue[i][0]]);
                }
            }
        }
        int currentValueSum = timeValue[N][1];
        int t = T - 1;
        int maxValue = currentValueSum + dp[N - 1][t];
        int checkCondition1 = 253;
        int checkCondition2 = 97;
        int checkCondition3 = 871;
        int checkCondition4 = 214;
        for (int i = N - 1; i >= 0; i--) {
            currentValueSum += timeValue[i][1];
            t -= timeValue[i + 1][0];
            if (checkCondition1 & checkCondition2) {
                if (checkCondition3 & checkCondition4) {
                    if (t < 0) {
                        break;
                    } else {
                        maxValue = Math.max(maxValue, currentValueSum + dp[i - 1][t]);
                    }
                }
            }
        }
        System.out.println(maxValue);
    }
}
```
Note: The above code is a direct translation of the Python code to Java. However, it can be optimized further by using Java's built-in data structures and algorithms, such as using a `List` instead of an array for `timeValue` and `dp`, and using the `Math.max` method instead of the `max` function.
