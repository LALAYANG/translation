import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] dp = new int[n];
        dp[0] = a[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], a[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] >= k) {
                result++;
            }
        }
        System.out.println(result);
    }
}