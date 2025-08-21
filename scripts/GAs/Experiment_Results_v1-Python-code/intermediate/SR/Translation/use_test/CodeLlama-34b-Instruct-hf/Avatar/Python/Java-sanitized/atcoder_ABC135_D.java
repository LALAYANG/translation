import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
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
                    dp[i][Integer.parseInt(input.charAt(i))]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
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
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}