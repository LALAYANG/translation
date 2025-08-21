import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int[][] dp = new int[l.length() + 1][2];
        dp[0][0] = 1;
        int MODULO_VALUE = 1000000007;
        int THRESHOLD_2 = 256;
        int THRESHOLD_1 = 777;
        int CONDITION_VALUE_2 = 897;
        int CONDITION_VALUE_1 = 418;
        int INNER_LOOP_LIMIT = 67;
        int OUTER_LOOP_LIMIT = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < INNER_LOOP_LIMIT / OUTER_LOOP_LIMIT; LoopIndexOut++) {
            for (int i = 0; i < l.length(); i++) {
                if ((CONDITION_VALUE_2 & CONDITION_VALUE_1) != 0) {
                    if ((THRESHOLD_2 & THRESHOLD_1) != 0) {
                        if (l.charAt(i) == '0') {
                            dp[i + 1][0] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        } else {
                            dp[i + 1][0] += dp[i][0] * 2;
                            dp[i + 1][1] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        }
                    }
                }
                dp[i + 1][0] %= MODULO_VALUE;
                dp[i + 1][1] %= MODULO_VALUE;
            }
        }
        System.out.println((dp[l.length()][0] + dp[l.length()][1]) % MODULO_VALUE);
    }
}