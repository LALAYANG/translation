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
        List<Integer> A = new ArrayList<>();
        rec(N, M, Q, a, b, c, d, A, res);
        System.out.println(res);
    }

    public static void rec(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, List<Integer> A, int res) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int last_max = 1;
        if (A.size() > 0) {
            last_max = A.get(A.size() - 1);
        }
        for (int i = last_max; i <= M; i++) {
            A.add(i);
            rec(N, M, Q, a, b, c, d, A, res);
            A.remove(A.size() - 1);
        }
    }
}