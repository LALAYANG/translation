import java.util.*;
import java.lang.*;

class Main {
    static int mod = (int)Math.pow(10, 9) + 7;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n = S.length();
        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            System.exit(0);
        }
        long[][] dp = new long[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (S.charAt(i) != '?') {
                    dp[i][Integer.parseInt(""+S.charAt(i))] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Integer.parseInt(""+S.charAt(i))) % 13] += dp[i - 1][k];
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