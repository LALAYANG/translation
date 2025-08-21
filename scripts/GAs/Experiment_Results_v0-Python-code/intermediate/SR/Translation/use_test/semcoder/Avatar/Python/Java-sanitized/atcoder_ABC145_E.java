import java.util.Scanner;

public class atcoder_ABC145_E {
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