import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) != '?') {
                dp[i][(S.charAt(i) - '0')]++;
            } else {
                for (int j = 0; j < 10; j++) {
                    dp[i][j]++;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 10; k++) {
                    dp[i][(j * 10 + k) % 13] += dp[i - 1][j];
                }
                dp[i][j] %= 1000000007;
            }
        }
        int ans = 0;
        for (int i = 0; i < 13; i++) {
            ans += dp[n - 1][i];
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}