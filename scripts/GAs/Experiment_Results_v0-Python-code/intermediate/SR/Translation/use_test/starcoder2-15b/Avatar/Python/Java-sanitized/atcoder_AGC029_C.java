import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        dp[0] = A[0];
        int dp_len = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[0]) {
                dp[0] = A[i];
            } else if (A[i] > dp[dp_len - 1]) {
                dp[dp_len] = A[i];
                dp_len++;
            } else {
                int l = 0, r = dp_len - 1;
                while (r - l > 1) {
                    int m = (l + r) / 2;
                    if (dp[m] >= A[i]) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                dp[r] = A[i];
            }
        }
        System.out.println(dp_len);
    }
}