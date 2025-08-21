import java.util.*;

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
        Arrays.sort(time_value, (a, b) -> a[1] - b[1]);
        int[][] dp = new int[N + 1][T + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i <= T; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= T; j++) {
                if (time_value[i][0] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], time_value[i][1] + dp[i - 1][j - time_value[i][0]]);
                }
            }
        }
        int current_value_sum = time_value[N][1];
        int t = T - 1;
        int max_value = current_value_sum + dp[N - 1][t];
        for (int i = N - 1; i >= 1; i--) {
            current_value_sum += time_value[i][1];
            t -= time_value[i + 1][0];
            if (t < 0) {
                break;
            }
            max_value = Math.max(max_value, current_value_sum + dp[i - 1][t]);
        }
        System.out.println(max_value);
    }
}