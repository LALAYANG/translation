import java.util.*;
import java.io.*;

public class atcoder_ABC135_D {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int mod = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) throws IOException {
        String S = readLine();
        int string_length = S.length();
        if (string_length == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            System.exit(0);
        }
        int[][] dp = new int[string_length][13];
        for (int i = 0; i < string_length; i++) {
            if (i == 0) {
                if (S.charAt(i) != '?') {
                    dp[i][Character.getNumericValue(S.charAt(i))] += 1;
                } else {
                    for (int j = 0; j <= 9; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Character.getNumericValue(S.charAt(i))) % 13] += dp[i - 1][k];
                    }
                } else {
                    for (int j = 0; j <= 9; j++) {
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

    static String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}