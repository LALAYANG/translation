```java
import java.util.Scanner;

public class Main {
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
```

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 5659
3 4 1 20460
1 3 0 10258
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476
``` 
