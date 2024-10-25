import java.util.Scanner;

public class atcoder_ABC145_E {
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