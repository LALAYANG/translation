import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], A[i - 1]);
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + A[i - j - 1]);
            }
        }

        System.out.println(dp[n]);
    }
}