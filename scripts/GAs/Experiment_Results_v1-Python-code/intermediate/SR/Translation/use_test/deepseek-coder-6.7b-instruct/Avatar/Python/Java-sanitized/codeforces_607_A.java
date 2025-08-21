import java.util.Scanner;

public class codeforces_607_A {
    static int[] value_list = new int[1000010];
    static int[] dp = new int[1000010];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int current_value = scanner.nextInt();
            int b = scanner.nextInt();
            value_list[current_value] = b;
        }
        if (value_list[0] > 0) {
            dp[0] = 1;
        }
        int mx = 0;
        int outer_loop_limit = 397;
        int outer_loop_step = 396;
        for (int loopIndexOut = 0; loopIndexOut < outer_loop_limit / outer_loop_step; loopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (value_list[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (value_list[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - value_list[i] - 1] + 1;
                }
                if (dp[i] > mx) {
                    mx = dp[i];
                }
            }
        }
        System.out.println(n - mx);
    }
}