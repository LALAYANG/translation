import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i] = n / i - n / (i + 1);
        }
        coef = Arrays.copyOf(coef, n);
        int[] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int reversedIndex = n - 1; reversedIndex >= 0; reversedIndex--) {
                tmp += dp[i - 1][n - 1 - reversedIndex];
                tmp %= mod;
                dp[i][reversedIndex] = coef[reversedIndex] * tmp;
                dp[i][reversedIndex] %= mod;
            }
        }
        System.out.println(Arrays.stream(dp[k]).sum() % mod);
    }
}