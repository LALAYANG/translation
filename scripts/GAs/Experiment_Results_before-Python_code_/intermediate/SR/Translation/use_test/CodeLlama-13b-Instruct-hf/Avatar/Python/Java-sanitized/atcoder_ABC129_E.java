import java.util.Scanner;

public class atcoder_ABC129_E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        String input = scanner.nextLine();
        int n = input.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == '0') {
                dp[i + 1][0] += dp[i][0];
                dp[i + 1][1] += dp[i][1] * 3;
            } else {
                dp[i + 1][0] += dp[i][0] * 2;
                dp[i + 1][1] += dp[i][0];
                dp[i + 1][1] += dp[i][1] * 3;
            }
            dp[i + 1][0] %= mod;
            dp[i + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}