import java.util.*;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        int[] dp = new int[N + 1];
        Arrays.fill(dp, 1);
        for (int i = 0; i < Q; i++) {
            int x = a[i] - 1;
            int y = b[i] - 1;
            int z = c[i];
            int w = d[i];
            if (dp[x] + dp[y] - 1 >= z) {
                res = Math.max(res, w);
            }
        }
        System.out.println(res);
    }
}