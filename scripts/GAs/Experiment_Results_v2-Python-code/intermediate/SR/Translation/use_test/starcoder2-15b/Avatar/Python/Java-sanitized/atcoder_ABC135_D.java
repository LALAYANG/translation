import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC135_D {
    static int mod = (int) (1e9 + 7);
    static int checkResultOne = 345;
    static int checkResultThree = 265;
    static int checkResultTwo = 13;
    static int checkResultFour = 217;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String S = fs.next();
        int n = S.length();
        if (checkResultOne & checkResultThree) {
            if (checkResultTwo & checkResultFour) {
                if (n == 1) {
                    if (S.equals("5") || S.equals("?")) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    return;
                }
            }
        }
        int[][] dp = new int[n][13];
        for (int idx = 0; idx < n; idx++) {
            if (idx == 0) {
                if (S.charAt(idx) != '?') {
                    dp[idx][Integer.parseInt(S.charAt(idx) + "")]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[idx][j]++;
                    }
                }
            } else {
                if (S.charAt(idx) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[idx][(k * 10 + Integer.parseInt(S.charAt(idx) + "")) % 13] += dp[idx - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[idx][(k * 10 + j) % 13] += dp[idx - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[idx][k] %= mod;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++)
                a[idx] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}