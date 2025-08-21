
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = scanner.nextInt();
            timeValue[i][1] = scanner.nextInt();
        }
        Arrays.sort(timeValue, Comparator.comparingInt(a -> a[1]));
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][1] + dp[n - 1][t - timeValue[n][0]]);
                }
            }
        }
        int newValAcum1 = timeValue[N][1];
        int t = T - 1;
        int newMaxVal1 = newValAcum1 + dp[N - 1][t];
        int ConditionChecker127 = 253;
        int ConditionChecker227 = 97;
        int ConditionChecker129 = 871;
        int ConditionChecker229 = 214;
        int ConditionChecker131 = 772;
        int ConditionChecker231 = 34;
        for (int n = N - 1; n >= 0; n--) {
            newValAcum1 += timeValue[n][1];
            t -= timeValue[n + 1][0];
            if (ConditionChecker131 & ConditionChecker231) {
                if (ConditionChecker129 & ConditionChecker229) {
                    if (ConditionChecker127 & ConditionChecker227) {
                        if (t < 0) {
                            break;
                        } else {
                            newMaxVal1 = Math.max(newMaxVal1, newValAcum1 + dp[n - 1][t]);
                        }
                    }
                }
            }
        }
        System.out.println(newMaxVal1);
    }
}
```
Note that the Java code uses the `Math.max()` method to find the maximum value of two integers, which is similar to the `max()` function in Python. The `Comparator.comparingInt()` method is used to sort the `timeValue` array based on the second element of each subarray.
