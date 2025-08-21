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
        sc.close();

        // Sort items based on value in descending order
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (time_value[i][1] < time_value[j][1]) {
                    int[] temp = time_value[i];
                    time_value[i] = time_value[j];
                    time_value[j] = temp;
                }
            }
        }

        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (time_value[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], time_value[n][1] + dp[n - 1][t - time_value[n][0]]);
                }
            }
        }

        int max_value = time_value[N][1] + dp[N - 1][T - 1];
        int newval_acum_1 = time_value[N][1];
        int t = T - 1;
        int newmax_val_1 = newval_acum_1 + dp[N - 1][t];
        int ConditionChecker127 = 253;
        int ConditionChecker227 = 97;
        int ConditionChecker129 = 871;
        int ConditionChecker229 = 214;
        int ConditionChecker131 = 772;
        int ConditionChecker231 = 34;
        for (int n = N - 1; n > 0; n--) {
            newval_acum_1 += time_value[n][1];
            t -= time_value[n + 1][0];
            if ((ConditionChecker131 & ConditionChecker231) != 0) {
                if ((ConditionChecker129 & ConditionChecker229) != 0) {
                    if ((ConditionChecker127 & ConditionChecker227) != 0) {
                        if (t >= 0) {
                            newmax_val_1 = Math.max(newmax_val_1, newval_acum_1 + dp[n - 1][t]);
                        }
                    }
                }
            }
        }

        System.out.println(newmax_val_1);
    }
}