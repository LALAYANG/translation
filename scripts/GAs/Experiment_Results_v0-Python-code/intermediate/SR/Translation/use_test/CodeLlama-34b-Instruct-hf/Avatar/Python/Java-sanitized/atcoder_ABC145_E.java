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
        int maxValue = dp[N][T];
        for (int i = N - 1; i >= 0; i--) {
            maxValue = Math.max(maxValue, dp[i][T - timeValue[i + 1][0]]);
        }
        System.out.println(maxValue);
    }
}