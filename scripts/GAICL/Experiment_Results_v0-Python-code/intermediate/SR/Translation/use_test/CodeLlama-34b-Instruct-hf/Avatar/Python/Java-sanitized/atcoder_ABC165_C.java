import java.util.Arrays;
import java.util.List;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        int Q = Integer.parseInt(args[2]);
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = Integer.parseInt(args[3 + i]);
            b[i] = Integer.parseInt(args[3 + i]);
            c[i] = Integer.parseInt(args[3 + i]);
            d[i] = Integer.parseInt(args[3 + i]);
        }

        int res = solve(N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        for (int i = 0; i < Q; i++) {
            int ans = 0;

            for (int j = 0; j < N; j++) {
                if (a[j] - b[j] == c[i]) {
                    ans += d[i];
                }
            }

            res = Math.max(res, ans);
        }

        return res;
    }
}