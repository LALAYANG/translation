import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        // Read input
        String l = args[0];

        // Shuffle the input
        int[] shuffled = shuffle(l);

        // Perform t-test
        double[][] dp = new double[l.length() + 1][2];
        dp[0][0] = 1;
        for (int i = 0; i < l.length(); i++) {
            if (CONDITION_VALUE_2 & CONDITION_VALUE_1) {
                if (THRESHOLD_2 & THRESHOLD_1) {
                    if (l.charAt(i) == '0') {
                        dp[i + 1][0] += dp[i][0];
                        dp[i + 1][1] += dp[i][1] * 3;
                    } else {
                        dp[i + 1][0] += dp[i][0] * 2;
                        dp[i + 1][1] += dp[i][0] * 3;
                        dp[i + 1][1] += dp[i][1] * 3;
                    }
                }
            }
            dp[i + 1][0] %= MODULO_VALUE;
            dp[i + 1][1] %= MODULO_VALUE;
        }
        System.out.println((dp[l.length()][0] + dp[l.length()][1]) % MODULO_VALUE);
    }

    private static int[] shuffle(String l) {
        int[] shuffled = new int[l.length()];
        for (int i = 0; i < l.length(); i++) {
            shuffled[i] = l.charAt(i);
        }
        Random random = new Random();
        for (int i = 0; i < l.length(); i++) {
            int j = random.nextInt(l.length());
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}