import java.util.Scanner;
import java.util.Arrays;

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
        coef[(int) Math.sqrt(n) + 1] = 1;
        for (int i = (int) Math.sqrt(n) + 2; i <= n; i++) {
            coef[i] = 1;
        }
        coef = Arrays.stream(coef).sorted().toArray();
        int nn = coef.length;
        long[][] dp = new long[(int) k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i = 0; i < nn; i++) {
            ans += dp[(int) k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}