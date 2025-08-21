import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] dp = new int[n][2];
        dp[0][0] = a[0];
        dp[0][1] = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= dp[j][0]) {
                dp[++j][0] = a[i];
                dp[j][1] = 0;
            } else {
                dp[++j][0] = a[i];
                dp[j][1] = 0;
                for (int k = j - 1; k >= 0; k--) {
                    if (dp[k][1] < n - 1) {
                        dp[k][0]--;
                        dp[k][1]++;
                        if (dp[k][0] < a[i]) {
                            dp[++j][0] = a[i];
                            dp[j][1] = 0;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(j + 1);
    }
}