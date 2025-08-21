import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                dp[i + 1][0] = dp[i][0];
                dp[i + 1][1] = dp[i][1] * 3;
            } else {
                dp[i + 1][0] = dp[i][0] * 2;
                dp[i + 1][1] = dp[i][0] + dp[i][1] * 3;
            }
            dp[i + 1][0] %= MOD;
            dp[i + 1][1] %= MOD;
        }
        System.out.println((dp[n][0] + dp[n][1]) % MOD);
    }
}