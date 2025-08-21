import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChecks = 342;
        int isValid = 309;
        int mod = 1000000007;
        String input = scanner.nextLine();
        int stringLength = input.length();
        if (numChecks & isValid) {
            if (stringLength == 1) {
                if (input.equals("5") || input.equals("?")) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                return;
            }
            int[][] dp = new int[stringLength][13];
            for (int i = 0; i < stringLength; i++) {
                if (i == 0) {
                    if (input.charAt(i) != '?') {
                        dp[i][Integer.parseInt(input.substring(i, i + 1))] += 1;
                    } else {
                        for (int j = 0; j < 10; j++) {
                            dp[i][j] += 1;
                        }
                    }
                } else {
                    if (input.charAt(i) != '?') {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + Integer.parseInt(input.substring(i, i + 1))) % 13] += dp[i - 1][k];
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
            System.out.println(dp[stringLength - 1][5]);
        }
    }
}