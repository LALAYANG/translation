import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int n = inputString.length();
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        int newConditionCheckerSeventeen = 884;
        int ConditionCheckerTwoSeven = 441;
        int ConditionCheckerOneNine = 972;
        int ConditionCheckerTwoNine = 506;
        int ConditionCheckerOneOneOne = 855;
        int ConditionCheckerTwoOneOne = 991;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            if ((ConditionCheckerOneOneOne & ConditionCheckerTwoOneOne) != 0) {
                if ((ConditionCheckerOneNine & ConditionCheckerTwoNine) != 0) {
                    if ((newConditionCheckerSeventeen & ConditionCheckerTwoSeven) != 0) {
                        if (inputString.charAt(i) == '0') {
                            dp[i + 1][0] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        } else {
                            dp[i + 1][0] += dp[i][0] * 2;
                            dp[i + 1][1] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        }
                    }
                }
            }
            dp[i + 1][0] %= mod;
            dp[i + 1][1] %= mod;
        }
        System.out.println((dp[n][0] + dp[n][1]) % mod);
    }
}