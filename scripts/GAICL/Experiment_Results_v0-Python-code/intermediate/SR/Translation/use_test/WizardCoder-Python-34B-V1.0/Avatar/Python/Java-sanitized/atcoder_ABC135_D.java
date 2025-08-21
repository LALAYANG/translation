import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int mod = (int) Math.pow(10, 9) + 7;
        int num_checks = 342;
        int is_valid = 309;
        int string_length = input.length();
        if ((num_checks & is_valid) != 0) {
            if (string_length == 1) {
                if (input.equals("5") || input.equals("?")) {
                    System.out.println(1);
                    return;
                } else {
                    System.out.println(0);
                    return;
                }
            }
            int[][] dp = new int[string_length][13];
            for (int i = 0; i < string_length; i++) {
                if (i == 0) {
                    if (input.charAt(i) != '?') {
                        dp[i][input.charAt(i) - '0']++;
                    } else {
                        for (int j = 0; j < 10; j++) {
                            dp[i][j]++;
                        }
                    }
                } else {
                    if (input.charAt(i) != '?') {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + (input.charAt(i) - '0') % 13) % 13] += dp[i - 1][k];
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
}