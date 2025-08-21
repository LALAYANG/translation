import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = n / i - n / (i + 1);
        }
        coef[n - 1] = 1;
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int cumulativeSum = 0;
            for (int j = n - 1; j >= 0; j--) {
                cumulativeSum += dp[i - 1][j];
                cumulativeSum %= 1000000007;
                dp[i][j] = coef[j] * cumulativeSum;
                dp[i][j] %= 1000000007;
            }
        }
        System.out.println(Arrays.stream(dp[k]).sum() % 1000000007);
    }
}