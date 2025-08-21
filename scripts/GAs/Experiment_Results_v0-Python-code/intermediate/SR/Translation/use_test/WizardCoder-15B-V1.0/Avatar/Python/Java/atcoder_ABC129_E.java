```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int MODULO_VALUE = 1000000007;
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
                if ((CONDITION_VALUE_2 & CONDITION_VALUE_1) != 0) {
                    if ((THRESHOLD_2 & THRESHOLD_1) != 0) {
                        if (c == '0') {
                            dp[i + 1][0] = (dp[i + 1][0] + dp[i][0]) % MODULO_VALUE;
                            dp[i + 1][1] = (dp[i + 1][1] + dp[i][1] * 3) % MODULO_VALUE;
                        } else {
                            dp[i + 1][0] = (dp[i + 1][0] + dp[i][0] * 2) % MODULO_VALUE;
                            dp[i + 1][1] = (dp[i + 1][1] + dp[i][0]) % MODULO_VALUE;
                            dp[i + 1][1] = (dp[i + 1][1] + dp[i][1] * 3) % MODULO_VALUE;
                        }
                    }
                }
            }
        }
        System.out.println((dp[STRING_LENGTH][0] + dp[STRING_LENGTH][1]) % MODULO_VALUE);
    }
}
```
