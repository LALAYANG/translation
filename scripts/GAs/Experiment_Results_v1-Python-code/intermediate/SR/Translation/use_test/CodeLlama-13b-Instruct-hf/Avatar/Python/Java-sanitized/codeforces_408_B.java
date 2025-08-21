import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[][] dp = new int[n][n];
            for (int j = 0; j < n; j++) {
                dp[j][j] = arr[j];
            }
            for (int k = 1; k < n; k++) {
                for (int j = 0; j < n - k; j++) {
                    dp[j][j + k] = Math.max(dp[j][j + k - 1], dp[j + 1][j + k]);
                }
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dp[j][j]);
            }
            System.out.println(max);
        }
    }
}