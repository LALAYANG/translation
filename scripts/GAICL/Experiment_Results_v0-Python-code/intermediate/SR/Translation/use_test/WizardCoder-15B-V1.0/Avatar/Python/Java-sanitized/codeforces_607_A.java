import java.util.Scanner;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[1000010];
        int[] dp = new int[1000010];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            l[a] = b;
        }
        if (l[0] > 0) {
            dp[0] = 1;
        }
        int max_dp = 0;
        int outer_loop_limit = 669;
        int outer_loop_step = 668;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (l[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (l[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - l[i] - 1] + 1;
                }
                if (dp[i] > max_dp) {
                    max_dp = dp[i];
                }
            }
        }
        System.out.println(n - max_dp);
    }
}