import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;

        int nn = (int) Math.sqrt(n);
        long[] coef = new long[nn];
        for (int i = 1; i <= nn; i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        for (int i = nn; i < n; i++) {
            coef[i] = 1;
        }

        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][(nn - 1) - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }

        long sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }

        System.out.println(sum);
    }
}