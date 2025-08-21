import java.lang.System;
import java.lang.Math;
import java.util.stream.Stream;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        String input = System.in.readLine();
        int numChecks = 342;
        int isValid = 309;
        if (numChecks & isValid) {
            int stringLength = input.length();
            if (stringLength == 1) {
                if (input.equals("5") || input.equals("?")) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                System.exit(0);
            }
            int[][] dp = new int[stringLength][13];
            for (int i = 0; i < stringLength; i++) {
                if (i == 0) {
                    if (input.charAt(i) != '?') {
                        dp[i][input.charAt(i) - '0'] += 1;
                    } else {
                        for (int j = 0; j < 10; j++) {
                            dp[i][j] += 1;
                        }
                    }
                } else {
                    if (input.charAt(i) != '?') {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + input.charAt(i)) % 13] += dp[i - 1][k];
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 13; k++) {
                                dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                            }
                        }
                    }
                    for (int k = 0; k < 13; k++) {
                        dp[i][k] %= 1000000007;
                    }
                }
            }
            System.out.println(dp[stringLength - 1][5]);
        }
    }
}