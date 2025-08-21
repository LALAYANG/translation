```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int n = inputString.length();
        long[][] dp = new long[n][13];
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (inputString.charAt(i) != '?') {
                    dp[i][Integer.parseInt(String.valueOf(inputString.charAt(i)))]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
                    }
                }
            } else {
                if (inputString.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Integer.parseInt(String.valueOf(inputString.charAt(i)))) % 13] += dp[i - 1][k];
                        dp[i][(k * 10 + Integer.parseInt(String.valueOf(inputString.charAt(i)))) % 13] %= mod;
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                            dp[i][(k * 10 + j) % 13] %= mod;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}
```

