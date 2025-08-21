import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        long[][] dp = new long[n][13];
        long mod = 1_000_000_007;

        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 13; k++) {
                if (i == 0) {
                    if (S.charAt(i) != '?') {
                        dp[i][Integer.parseInt(String.valueOf(S.charAt(i)))]++;
                    } else {
                        for (int j = 0; j < 10; j++) {
                            dp[i][j]++;
                        }
                    }
                } else {
                    if (S.charAt(i) != '?') {
                        for (int l = 0; l < 13; l++) {
                            dp[i][(l * 10 + Integer.parseInt(String.valueOf(S.charAt(i)))) % 13] += dp[i - 1][l];
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            for (int l = 0; l < 13; l++) {
                                dp[i][(l * 10 + j) % 13] += dp[i - 1][l];
                            }
                        }
                    }
                    for (int l = 0; l < 13; l++) {
                        dp[i][l] %= mod;
                    }
                }
            }
        }

        System.out.println(dp[n - 1][5]);
    }
}