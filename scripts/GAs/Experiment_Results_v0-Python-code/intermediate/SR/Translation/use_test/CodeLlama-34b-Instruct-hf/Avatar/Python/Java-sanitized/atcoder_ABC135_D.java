import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numChecks = 342;
        int isValid = 309;
        int mod = 1000000007;
        String input = sc.nextLine();
        int stringLength = input.length();
        int[][] dp = new int[stringLength][13];
        for (int i = 0; i < stringLength; i++) {
            if (i == 0) {
                if (input.charAt(i) != '?') {
                    dp[i][Integer.parseInt(input.charAt(i))] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (input.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Integer.parseInt(input.charAt(i))) % 13] += dp[i - 1][k];
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