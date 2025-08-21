import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long mod = 1000000007;
        long[] coef = new long[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = n / i - n / (i + 1);
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[(int) Math.sqrt(n) + 1 - i] = coef[i];
        }
        long[][] dp = new long[(int) k + 1][(int) Math.sqrt(n) + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = (int) Math.sqrt(n); j >= 0; j--) {
                tmp += dp[i - 1][(int) Math.sqrt(n) - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i = 0; i <= (int) Math.sqrt(n); i++) {
            ans += dp[(int) k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}