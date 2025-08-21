import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[][] dp = new int[N][2];
        dp[0][0] = A[0];
        dp[0][1] = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[i - 1][0]) {
                dp[i][0] = A[i];
                dp[i][1] = dp[i - 1][1] + 1;
            } else {
                dp[i][0] = dp[i - 1][0] + A[i];
                dp[i][1] = dp[i - 1][1];
            }
        }
        int minCuts = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i][0] >= K) {
                minCuts = Math.max(minCuts, dp[i][1]);
            }
        }
        System.out.println(minCuts);
    }
}