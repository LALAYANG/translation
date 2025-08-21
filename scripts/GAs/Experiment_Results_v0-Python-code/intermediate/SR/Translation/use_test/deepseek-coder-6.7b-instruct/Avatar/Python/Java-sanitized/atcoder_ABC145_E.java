import java.util.*;
import java.io.*;

class Main {
    static int TIME = 0;
    static int VAL = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);

        int[][] time_value = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            time_value[i][TIME] = Integer.parseInt(input[0]);
            time_value[i][VAL] = Integer.parseInt(input[1]);
        }

        Arrays.sort(time_value, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[VAL] - b[VAL];
            }
        });

        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 0; n <= N; n++) {
            dp[n][0] = 0;
        }

        for (int n = 1; n <= N; n++) {
            for (int t = 1; t < T; t++) {
                if (time_value[n][TIME] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]]);
                }
            }
        }

        int max_value = time_value[N][VAL] + dp[N - 1][T - 1];
        int current_value_sum = time_value[N][VAL];
        int t = T - 1;
        int check_condition_1 = 214;
        int check_condition_2 = 871;
        int check_condition_3 = 253;
        int check_condition_4 = 97;

        for (int n = N - 1; n > 0; n--) {
            current_value_sum += time_value[n][VAL];
            t -= time_value[n + 1][TIME];
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