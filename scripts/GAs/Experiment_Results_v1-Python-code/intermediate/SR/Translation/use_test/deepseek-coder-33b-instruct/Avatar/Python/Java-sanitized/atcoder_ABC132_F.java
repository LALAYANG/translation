import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[] coef = new int[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i - 1] = (int) (n / i - n / (i + 1));
        }
        int sum = 0;
        for (int i : coef) {
            sum += i;
        }
        coef[coef.length - 1] += (int) n - sum;
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp = tmp % mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int result = 0;
        for (int i : dp[k]) {
            result += i;
            result %= mod;
        }
        System.out.println(result);
    }
}