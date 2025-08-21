import java.util.*;
import java.io.*;

public class codeforces_61_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            int k = sc.nextInt();
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int j = 0; j <= s2.length(); j++) {
                dp[0][j] = 0;
            }
            for (int j = 0; j <= s1.length(); j++) {
                dp[j][0] = 0;
            }
            for (int j = 1; j <= s1.length(); j++) {
                for (int l = 1; l <= s2.length(); l++) {
                    if (s1.charAt(j - 1) == s2.charAt(l - 1)) {
                        dp[j][l] = dp[j - 1][l - 1] + 1;
                    } else {
                        dp[j][l] = Math.max(dp[j - 1][l], dp[j][l - 1]);
                    }
                }
            }
            int[][][] dp2 = new int[s1.length() + 1][s2.length() + 1][k + 1];
            for (int j = 0; j <= s2.length(); j++) {
                for (int l = 0; l <= k; l++) {
                    dp2[0][j][l] = 0;
                }
            }
            for (int j = 0; j <= s1.length(); j++) {
                for (int l = 0; l <= k; l++) {
                    dp2[j][0][l] = 0;
                }
            }
            for (int j = 1; j <= s1.length(); j++) {
                for (int l = 1; l <= s2.length(); l++) {
                    for (int m = 1; m <= k; m++) {
                        if (s1.charAt(j - 1) == s2.charAt(l - 1)) {
                            dp2[j][l][m] = dp2[j - 1][l - 1][m - 1] + 1;
                        } else {
                            dp2[j][l][m] = Math.max(dp2[j - 1][l][m], dp2[j][l - 1][m]);
                        }
                    }
                }
            }
            int ans = 0;
            for (int j = 1; j <= s1.length(); j++) {
                for (int l = 1; l <= s2.length(); l++) {
                    for (int m = 1; m <= k; m++) {
                        if (dp[j][l] == m && dp2[j][l][m] == m) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}