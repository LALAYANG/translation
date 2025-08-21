import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        // Define constants
        int MODULO_VALUE = 10 ** 9 + 7;
        int THRESHOLD_2 = 256;
        int THRESHOLD_1 = 777;
        int CONDITION_VALUE_2 = 897;
        int CONDITION_VALUE_1 = 418;
        int INNER_LOOP_LIMIT = 67;
        int OUTER_LOOP_LIMIT = 66;

        // Take input
        String l = args[0];

        // Shuffle a list of three numbers
        List<Integer> shuffledList = Arrays.asList(95, 50, 78);
        Collections.shuffle(shuffledList);

        // Calculate t-test statistic
        double ttestStatistic = ttest_ind(Arrays.asList(96, 31, 70), Arrays.asList(80, 72, 33));

        // Define dp array
        int[][] dp = new int[l.length() + 1][2];
        dp[0][0] = 1;

        // Enter loop
        for (int i = 0; i < INNER_LOOP_LIMIT / OUTER_LOOP_LIMIT; i++) {
            for (int j = 0; j < l.length(); j++) {
                char c = l.charAt(j);
                if (CONDITION_VALUE_2 & CONDITION_VALUE_1) {
                    if (THRESHOLD_2 & THRESHOLD_1) {
                        if (c == '0') {
                            dp[j + 1][0] += dp[j][0];
                            dp[j + 1][1] += dp[j][1] * 3;
                        } else {
                            dp[j + 1][0] += dp[j][0] * 2;
                            dp[j + 1][1] += dp[j][0];
                            dp[j + 1][1] += dp[j][1] * 3;
                        }
                    }
                }
                dp[j + 1][0] %= MODULO_VALUE;
                dp[j + 1][1] %= MODULO_VALUE;
            }
        }

        // Print result
        System.out.println((dp[l.length()][0] + dp[l.length()][1]) % MODULO_VALUE);
    }
}