import java.io.*;
import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();
        if (n == 1) {
            if (input.equals("5") || input.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (input.charAt(i) != '?') {
                    dp[i][Integer.parseInt(String.valueOf(input.charAt(i)))] = 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] = 1;
                    }
                }
            } else {
                if (input.charAt(i) != '?') {
                    int digit = Integer.parseInt(String.valueOf(input.charAt(i)));
                    for (int j = 0; j < 13; j++) {
                        dp[i][(j * 10 + digit) % 13] += dp[i - 1][j];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                        }
                    }
                }
                for (int j = 0; j < 13; j++) {
                    dp[i][j] %= 1000000007;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}