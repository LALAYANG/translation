import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int string_length = S.length();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[string_length][13];
        for (int i = 0; i < string_length; i++) {
            if (i == 0) {
                if (S.charAt(i) != '?') {
                    dp[i][Integer.parseInt(String.valueOf(S.charAt(i)))] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Integer.parseInt(String.valueOf(S.charAt(i)))) % 13] += dp[i - 1][k];
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
        System.out.println(dp[string_length - 1][5]);
    }
}