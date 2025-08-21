```java
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        int[] shuffled = {95, 50, 78};
        Arrays.sort(shuffled);
        int[][] ttest_ind = {{96, 31, 70}, {80, 72, 33}};
        int MODULO_VALUE = (int) (Math.pow(10, 9) + 7);
        int STRING_LENGTH = l.length();
        int[][] dp = new int[STRING_LENGTH + 1][2];
        dp[0][0] = 1;
        int THRESHOLD_2 = 256;
        int THRESHOLD_1 = 777;
        int CONDITION_VALUE_2 = 897;
        int CONDITION_VALUE_1 = 418;
        int INNER_LOOP_LIMIT = 67;
        int OUTER_LOOP_LIMIT = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < INNER_LOOP_LIMIT / OUTER_LOOP_LIMIT; LoopIndexOut++) {
            for (int i = 0; i < STRING_LENGTH; i++) {
                char c = l.charAt(i);
                if (CONDITION_VALUE_2 & CONDITION_VALUE_1 != 0) {
                    if (THRESHOLD_2 & THRESHOLD_1 != 0) {
                        if (c == '0') {
                            dp[i + 1][0] = (dp[i][0] + dp[i][0]) % MODULO_VALUE;
                            dp[i + 1][1] = (dp[i][1] * 3 + dp[i][1]) % MODULO_VALUE;
                        } else {
                            dp[i + 1][0] = (dp[i][0] * 2 + dp[i][0]) % MODULO_VALUE;
                            dp[i + 1][1] = (dp[i][0] + dp[i][1] * 3) % MODULO_VALUE;
                        }
                    }
                }
                dp[i + 1][0] %= MODULO_VALUE;
                dp[i + 1][1] %= MODULO_VALUE;
            }
        }
        System.out.println((dp[STRING_LENGTH][0] + dp[STRING_LENGTH][1]) % MODULO_VALUE);
    }
}
``` 
