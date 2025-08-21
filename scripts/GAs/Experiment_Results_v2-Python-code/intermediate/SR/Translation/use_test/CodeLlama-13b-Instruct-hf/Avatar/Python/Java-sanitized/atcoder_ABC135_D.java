import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length();
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (input.charAt(i) != '?') {
                    dp[i][input.charAt(i) - '0'] += 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] += 1;
                    }
                }
            } else {
                if (input.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + input.charAt(i)) % 13] += dp[i - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[i][k] %= 1000000007;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}