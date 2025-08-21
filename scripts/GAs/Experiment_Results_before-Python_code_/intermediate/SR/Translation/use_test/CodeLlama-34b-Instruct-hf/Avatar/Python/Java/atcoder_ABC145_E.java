```java
import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = scanner.nextInt();
            timeValue[i][1] = scanner.nextInt();
        }
        int[][] dp = new int[N + 1][T + 1];
        for (int i = 1; i <= N; i++) {
            for (int t = 1; t <= T; t++) {
                if (timeValue[i][0] > t) {
                    dp[i][t] = dp[i - 1][t];
                } else {
                    dp[i][t] = Math.max(dp[i - 1][t], timeValue[i][1] + dp[i - 1][t - timeValue[i][0]]);
                }
            }
        }
        int maxVal = dp[N][T];
        for (int i = N - 1; i >= 1; i--) {
            int t = T - timeValue[i + 1][0];
            if (t < 0) {
                break;
            }
            maxVal = Math.max(maxVal, timeValue[i][1] + dp[i - 1][t]);
        }
        System.out.println(maxVal);
    }
}
```
Note: The above code is a Java implementation of the Knapsack problem, which is a classic problem in computer science and optimization. The problem is to find the maximum value that can be obtained by selecting a subset of items from a set of items, where each item has a weight and a value, and the total weight of the selected items should not exceed a given limit. The code uses a dynamic programming approach to solve the problem, and it is based on the Python code provided in the question.
