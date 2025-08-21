import java.util.*;
import java.io.*;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
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
        solve(array_length, M, Q, a, b, c, d);
    }

    static void solve(int array_length, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        void rec(int[] A) {
            if (A.length == array_length) {
                int ans = 0;

                void calculate_score(int i, int stop, int step) {
                    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                        return;
                    }
                    if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                        ans += d[i];
                    }
                    calculate_score(i + step, stop, step);
                }
                calculate_score(0, Q, 1);
                res = Math.max(res, ans);
                return;
            }
            int previous_max_value = A.length == 0 ? 1 : A[A.length - 1];
            for (int i = previous_max_value; i <= M; i++) {
                rec(Arrays.copyOf(A, A.length + 1));
                A[A.length - 1] = i;
            }
        }
        rec(new int[0]);
        System.out.println(res);
    }
}