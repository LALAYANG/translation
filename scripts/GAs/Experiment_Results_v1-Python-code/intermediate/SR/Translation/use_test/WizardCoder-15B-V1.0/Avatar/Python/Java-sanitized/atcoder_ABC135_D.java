import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        int n = input_string.length();
        if (n == 1) {
            if (input_string.equals("5") || input_string.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (input_string.charAt(i) != '?') {
                    dp[i][(int) input_string.charAt(i) - '0'] = 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] = 1;
                    }
                }
            } else {
                if (input_string.charAt(i) != '?') {
                    for (int j = 0; j < 13; j++) {
                        for (int k = 0; k < 10; k++) {
                            dp[i][(j * 10 + k) % 13] += dp[i - 1][j];
                            dp[i][(j * 10 + k) % 13] %= 1000000007;
                        }
                    }
                } else {
                    for (int j = 0; j < 13; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(j * 10 + k) % 13] += dp[i - 1][k];
                            dp[i][(j * 10 + k) % 13] %= 1000000007;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}