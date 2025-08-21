import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }

        int res = solve(N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        void rec(int[] A) {
            if (A.length == N) {
                int ans = 0;

                void func_loop_queries(int i, int stop, int step) {
                    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                        return;
                    }
                    if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                        ans += d[i];
                    }
                    func_loop_queries(i + step, stop, step);
                }
                func_loop_queries(0, Q, 1);
                res = Math.max(res, ans);
                return;
            }
            int last_max = A.length == 0 ? 1 : A[A.length - 1];

            void func_loop_recursive(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                rec(append(A, i));
                func_loop_recursive(i + step, stop, step);
            }
            func_loop_recursive(last_max, M + 1, 1);
        }
        rec(new int[0]);
        return res;
    }

    public static int[] append(int[] A, int x) {
        int[] newA = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            newA[i] = A[i];
        }
        newA[A.length] = x;
        return newA;
    }
}