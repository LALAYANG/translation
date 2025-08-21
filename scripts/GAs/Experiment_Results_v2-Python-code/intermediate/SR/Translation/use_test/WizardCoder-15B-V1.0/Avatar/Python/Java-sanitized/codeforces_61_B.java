import java.util.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] x = new int[k];
        int[] y = new int[k];
        for (int i = 0; i < k; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] != Integer.MAX_VALUE) {
                    if (i > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + grid[i][j]);
                    }
                    if (j > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + grid[i][j]);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            ans = Math.min(ans, dp[x[i]][y[i]]);
        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(ans);
        }
    }
}