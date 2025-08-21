```java
import java.util.*;

public class Main {
    static int mod = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.next();
        int n = input_string.length();
        if (n == 1) {
            if (input_string.equals("5") || input_string.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            System.exit(0);
        }
        long[][] dp = new long[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (!input_string.substring(i, i + 1).equals("?")) {
                    dp[i][Integer.parseInt(input_string.substring(i, i + 1))] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (!input_string.substring(i, i + 1).equals("?")) {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Integer.parseInt(input_string.substring(i, i + 1))) % 13] += dp[i - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[i][k] %= mod;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}
```

