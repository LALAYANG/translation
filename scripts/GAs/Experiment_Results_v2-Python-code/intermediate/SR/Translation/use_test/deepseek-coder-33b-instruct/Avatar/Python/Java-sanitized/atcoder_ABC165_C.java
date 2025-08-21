import java.util.*;

public class atcoder_ABC165_C {
    static int res = 0;
    static int array_length, M, Q;
    static int[] a, b, c, d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array_length = sc.nextInt();
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
        solve(new ArrayList<>());
        System.out.println(res);
    }

    public static void solve(List<Integer> A) {
        if (A.size() == array_length) {
            int ans = 0;
            calculate_score(0, Q, 1, A, ans);
            res = Math.max(res, ans);
            return;
        }
        int previous_max_value = (A.size() == 0) ? 1 : A.get(A.size() - 1);
        for (int i = previous_max_value; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            solve(newA);
        }
    }

    public static void calculate_score(int i, int stop, int step, List<Integer> A, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
            ans += d[i];
        }
        calculate_score(i + step, stop, step, A, ans);
    }
}