import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        int n = input_string.length();
        if (n == 1) {
            if (input_string.equals("5") || input_string.equals("?")) {
                System.out.println(1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (input_string.charAt(i) != '?') {
                    dp[i][Character.getNumericValue(input_string.charAt(i))]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        initialize_first_digit_dp(j, 10, 1, dp, i);
                }
            } else {
                if (input_string.charAt(i) != '?') {
                    update_dp_with_digit(0, 13, 1, dp, i, Character.getNumericValue(input_string.charAt(i)));
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
        System.out.println(dp[n - 1][5]);
    }

    public static void initialize_first_digit_dp(int j, int stop, int step, int[][] dp, int i) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        dp[i][j]++;
        initialize_first_digit_dp(j + step, stop, step, dp, i);
    }

    public static void update_dp_with_digit(int k, int stop, int step, int[][] dp, int i, int digit) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        dp[i][(k * 10 + digit) % 13] += dp[i - 1][k];
        update_dp_with_digit(k + step, stop, step, dp, i, digit);
    }
}