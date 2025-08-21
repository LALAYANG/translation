import java.util.*;

public class atcoder_ABC165_C {
    static int res = 0;
    static int array_length, M, Q;
    static int[] a, b, c, d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_length = scanner.nextInt();
        M = scanner.nextInt();
        Q = scanner.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        solve(new ArrayList<>(), 0);
        System.out.println(res);
    }

    static void solve(List<Integer> A, int start) {
        if (A.size() == array_length) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        for (int i = start + 1; i <= M; i++) {
            A.add(i);
            solve(new ArrayList<>(A), i);
            A.remove(A.size() - 1);
        }
    }
}