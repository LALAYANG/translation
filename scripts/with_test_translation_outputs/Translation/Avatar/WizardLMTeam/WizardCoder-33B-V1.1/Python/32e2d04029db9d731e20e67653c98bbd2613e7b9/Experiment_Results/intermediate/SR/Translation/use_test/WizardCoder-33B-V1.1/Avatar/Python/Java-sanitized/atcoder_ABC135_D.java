import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        int mod = (int)1e9 + 7;
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (S.charAt(i) != '?') {
                    dp[i][S.charAt(i) - '0']++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + S.charAt(i) - '0') % 13] += dp[i - 1][k];
                        dp[i][(k * 10 + S.charAt(i) - '0') % 13] %= mod;
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                            dp[i][(k * 10 + j) % 13] %= mod;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}