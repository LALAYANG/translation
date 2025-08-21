import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        final long mod = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int n = inputString.length();
        long[][] dp = new long[n + 1][2];
        dp[0][0] = 1;
        int newConditionCheckerSeventeen = 884;
        int conditionCheckerTwoSeven = 441;
        int conditionCheckerOneNine = 972;
        int conditionCheckerTwoNine = 506;
        int conditionCheckerOneOneOne = 855;
        int conditionCheckerTwoOneOne = 991;
        for (int i = 0; i < n; i++) {
            if ((conditionCheckerOneOneOne & conditionCheckerTwoOneOne) != 0) {
                if ((conditionCheckerOneNine & conditionCheckerTwoNine) != 0) {
                    if ((newConditionCheckerSeventeen & conditionCheckerTwoSeven) != 0) {
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