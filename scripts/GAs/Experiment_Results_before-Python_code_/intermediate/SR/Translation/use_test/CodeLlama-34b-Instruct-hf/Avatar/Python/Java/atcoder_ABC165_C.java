```java
import java.util.Scanner;

public class Solution {
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
        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        rec(new int[0], N, M, Q, a, b, c, d, res);
        System.out.println(res);
    }

    public static void rec(int[] A, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int res) {
        if (A.length == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int lastMax = A.length == 0 ? 1 : A[A.length - 1];
        for (int i = lastMax; i <= M; i++) {
            int[] newA = new int[A.length + 1];
            System.arraycopy(A, 0, newA, 0, A.length);
            newA[A.length] = i;
            rec(newA, N, M, Q, a, b, c, d, res);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
