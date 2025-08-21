import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[][] dp = new int[n][2];
        dp[0][0] = A[0];
        dp[0][1] = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] <= dp[i - 1][0]) {
                dp[i][0] = A[i];
                dp[i][1] = dp[i - 1][1] + 1;
            } else {
                dp[i][0] = A[i];
                dp[i][1] = 0;
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i][1] == 0) {
                k = i;
                break;
            }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i][0] = dp[i][0];
            result[i][1] = dp[i][1];
        }
        return result;
    }
}