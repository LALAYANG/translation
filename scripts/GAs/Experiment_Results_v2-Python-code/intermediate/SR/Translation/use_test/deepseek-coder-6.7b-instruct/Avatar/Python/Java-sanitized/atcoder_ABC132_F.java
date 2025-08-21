import java.util.Scanner;

public class atcoder_ABC132_F {
    static long mod = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();

        long[] coef = new long[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = n / i - n / (i + 1);
        }

        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum += coef[i];
        }

        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            coef[i] = coef[i] + coef[(int) sum];
            sum = sum - coef[i];
        }

        long[][] dp = new long[k + 1][(int) Math.sqrt(n) + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = (int) Math.sqrt(n); j >= 0; j--) {
                tmp = (tmp + dp[i - 1][(int) Math.sqrt(n) - j]) % mod;
                dp[i][j] = (coef[j] * tmp) % mod;
            }
        }

        long result = 0;
        for (int i = 0; i <= (int) Math.sqrt(n); i++) {
            result = (result + dp[k][i]) % mod;
        }

        System.out.println(result);
    }
}