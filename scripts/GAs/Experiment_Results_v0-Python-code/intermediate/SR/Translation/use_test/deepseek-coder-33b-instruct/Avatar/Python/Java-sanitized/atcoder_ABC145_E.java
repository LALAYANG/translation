import java.util.*;

public class atcoder_ABC145_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] time_value = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            time_value[i][0] = scanner.nextInt();
            time_value[i][1] = scanner.nextInt();
        }
        Arrays.sort(time_value, Comparator.comparingInt(a -> a[1]));
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
        int current_value_sum = time_value[N][1];
        int t = T - 1;
        int max_value = current_value_sum + dp[N - 1][t];
        int check_condition_3 = 253;
        int check_condition_4 = 97;
        int check_condition_2 = 871;
        int check_condition_1 = 214;
        for (int n = N - 1; n > 0; n--) {
            current_value_sum += time_value[n][1];
            t -= time_value[n + 1][0];
            if ((check_condition_2 & check_condition_1) != 0) {
                if ((check_condition_3 & check_condition_4) != 0) {
                    if (t < 0) {
                        break;
                    } else {
                        max_value = Math.max(max_value, current_value_sum + dp[n - 1][t]);
                    }
                }
            }
        }
        System.out.println(max_value);
    }
}