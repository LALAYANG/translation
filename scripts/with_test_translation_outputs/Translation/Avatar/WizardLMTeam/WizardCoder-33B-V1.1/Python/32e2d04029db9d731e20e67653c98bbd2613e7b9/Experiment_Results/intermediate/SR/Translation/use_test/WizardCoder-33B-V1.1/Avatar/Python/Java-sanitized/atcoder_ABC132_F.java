import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = (long) Math.pow(10, 9) + 7;
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int[] coef = new int[sqrtN];
        for (int i = 1; i <= sqrtN; i++) {
            coef[i - 1] = (int) (n / i) - (int) (n / (i + 1));
        }
        int sum = 0;
        for (int i = 0; i < coef.length; i++) {
            sum += coef[i];
        }
        for (int i = sum; i < n; i++) {
            coef[i] = 1;
        }
        int nn = coef.length;
        long[][] dp = new long[k + 1][nn];
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
        long result = 0;
        for (int i = 0; i < nn; i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}