Thought process:
1. Parse the input to extract the number of items `N` and the total time `T`.
2. Read the time and value pairs for each item and store them in `time_value`.
3. Sort the items based on their value in descending order.
4. Initialize the dynamic programming table `dp`.
5. Fill in the base cases for time and value.
6. Iterate through items and time slots to fill in the dynamic programming table.
7. Calculate the maximum value that can be achieved within the time constraint.
8. Print the maximum value.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[][] time_value = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            time_value[i][0] = sc.nextInt();
            time_value[i][1] = sc.nextInt();
        }

        // Sort items based on value in descending order
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (time_value[j][1] > time_value[i][1]) {
                    int[] temp = time_value[i];
                    time_value[i] = time_value[j];
                    time_value[j] = temp;
                }
            }
        }

        // Dynamic programming table
        int[][] dp = new int[N + 1][T];

        // Base cases
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
        }

        // Fill in the dynamic programming table
        for (int n = 1; n <= N; n++) {
            for (int t = 1; t < T; t++) {
                if (time_value[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], time_value[n][1] + dp[n - 1][t - time_value[n][0]]);
                }
            }
        }

        int max_value = time_value[N][1] + dp[N - 1][T - 1];
        System.out.println(max_value);
    }
}
```
