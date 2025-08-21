
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] timeValue = new int[N][2];
        for (int i = 0; i < N; i++) {
            timeValue[i][0] = sc.nextInt();
            timeValue[i][1] = sc.nextInt();
        }
        Arrays.sort(timeValue, Comparator.comparingInt(a -> a[1]));
        int[][] dp = new int[N][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n < N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][1] + dp[n - 1][t - timeValue[n][0]]);
                }
            }
        }
        int valAcum = timeValue[N - 1][1];
        int t = T - 1;
        int maxVal = valAcum + dp[N - 1][t];
        for (int n = N - 2; n >= 0; n--) {
            valAcum += timeValue[n][1];
            t -= timeValue[n + 1][0];
            if (t < 0) {
                break;
            } else {
                maxVal = Math.max(maxVal, valAcum + dp[n - 1][t]);
            }
        }
        System.out.println(maxVal);
    }
}
```
Note that the Java code uses the `Comparator` class to sort the `timeValue` array based on the second element of each subarray. The `Arrays.sort()` method is used to sort the array in ascending order.

Also, the Java code uses the `Math.max()` method to find the maximum value between two numbers.

The rest of the code is similar to the Python code, with some minor changes to account for the differences in syntax between the two languages.
