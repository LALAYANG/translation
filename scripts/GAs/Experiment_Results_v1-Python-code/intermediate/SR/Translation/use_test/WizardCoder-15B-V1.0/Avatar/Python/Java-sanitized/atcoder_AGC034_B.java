import java.util.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'A') {
                dp[i] = dp[i - 1];
            } else if (s.charAt(i) == 'B') {
                if (i < n - 1 && s.charAt(i + 1) == 'C') {
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = dp[i - 1] * 2;
                }
            } else {
                dp[i] = dp[i - 1] * 2;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i] * (n - i);
        }
        System.out.println(ans);
    }
}