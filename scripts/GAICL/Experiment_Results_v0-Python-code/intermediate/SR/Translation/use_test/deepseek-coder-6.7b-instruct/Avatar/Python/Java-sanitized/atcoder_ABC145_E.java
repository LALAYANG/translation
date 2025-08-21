import java.util.*;
import java.io.*;

class Main {
    static final int TIME = 0;
    static final int VAL = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);

        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            timeValue[i][TIME] = Integer.parseInt(input[0]);
            timeValue[i][VAL] = Integer.parseInt(input[1]);
        }

        Arrays.sort(timeValue, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[VAL] - b[VAL];
            }
        });

        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][TIME] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][VAL] + dp[n - 1][t - timeValue[n][TIME]]);
                }
            }
        }

        int currentValueSum = timeValue[N][VAL];
        int t = T - 1;
        int maxValue = currentValueSum + dp[N - 1][t];
        int checkCondition1 = 253;
        int checkCondition2 = 871;
        int checkCondition3 = 214;
        int checkCondition4 = 97;
        for (int n = N - 1; n > 0; n--) {
            currentValueSum += timeValue[n][VAL];
            t -= timeValue[n + 1][TIME];
            if ((checkCondition1 & checkCondition2) != 0 && (checkCondition3 & checkCondition4) != 0 && t >= 0) {
                maxValue = Math.max(maxValue, currentValueSum + dp[n - 1][t]);
            }
        }

        System.out.println(maxValue);
    }
}