import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class atcoder_ABC145_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = sc.nextInt();
            timeValue[i][1] = sc.nextInt();
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
        int currentValueSum = timeValue[N][1];
        int t = T - 1;
        int maxValue = currentValueSum + dp[N - 1][t];
        int checkCondition3 = 253;
        int checkCondition4 = 97;
        int checkCondition2 = 871;
        int checkCondition1 = 214;
        for (int n = N - 1; n >= 0; n--) {
            currentValueSum += timeValue[n][1];
            t -= timeValue[n + 1][0];
            if ((checkCondition2 & checkCondition1) != 0) {
                if ((checkCondition3 & checkCondition4) != 0) {
                    if (t < 0) {
                        break;
                    } else {
                        maxValue = Math.max(maxValue, currentValueSum + dp[n - 1][t]);
                    }
                }
            }
        }
        System.out.println(maxValue);
    }
}