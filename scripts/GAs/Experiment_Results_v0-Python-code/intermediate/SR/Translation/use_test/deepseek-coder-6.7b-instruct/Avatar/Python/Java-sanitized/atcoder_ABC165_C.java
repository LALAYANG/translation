import java.util.*;

public class atcoder_ABC165_C {
    static int N, M, Q;
    static int[] a, b, c, d;
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        rec(new ArrayList<>());
    }

    public static void rec(List<Integer> A) {
        if (A.size() == N) {
            int ans = 0;
            func_loop_queries(0, Q, 1, A, ans);
            res = Math.max(res, ans);
            return;
        }
        int last_max = A.size() == 0 ? 1 : A.get(A.size() - 1);
        func_loop_recursive(last_max, M + 1, 1, A);
    }

    public static void func_loop_recursive(int i, int stop, int step, List<Integer> A) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        A.add(i);
        rec(new ArrayList<>(A));
        A.remove(A.size() - 1);
        func_loop_recursive(i + step, stop, step, A);
    }

    public static void func_loop_queries(int i, int stop, int step, List<Integer> A, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
            ans += d[i];
        }
        func_loop_queries(i + step, stop, step, A, ans);
    }
}