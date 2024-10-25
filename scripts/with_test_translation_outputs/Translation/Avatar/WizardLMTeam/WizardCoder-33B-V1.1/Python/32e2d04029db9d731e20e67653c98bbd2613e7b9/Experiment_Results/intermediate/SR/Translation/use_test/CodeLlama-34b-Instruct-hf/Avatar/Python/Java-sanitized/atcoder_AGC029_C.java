import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], A[i - 1]);
        }

        int K = scanner.nextInt();
        int[] cuts = new int[K];
        for (int i = 0; i < K; i++) {
            cuts[i] = scanner.nextInt();
        }

        int[][] memo = new int[K + 1][n + 1];
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }

        int result = solve(dp, cuts, memo, 0, 0);
        System.out.println(result);
    }

    private static int solve(int[] dp, int[] cuts, int[][] memo, int i, int j) {
        if (i == cuts.length) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int result = Integer.MAX_VALUE;
        for (int k = j; k < dp.length; k++) {
            if (dp[k] - dp[j] >= cuts[i]) {
                result = Math.min(result, solve(dp, cuts, memo, i + 1, k + 1) + 1);
            }
        }
        memo[i][j] = result;
        return result;
    }
}