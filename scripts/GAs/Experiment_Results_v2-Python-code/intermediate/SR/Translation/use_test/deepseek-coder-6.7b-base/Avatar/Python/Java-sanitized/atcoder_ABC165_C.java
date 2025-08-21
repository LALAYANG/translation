import java.util.*;
import java.util.stream.IntStream;

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
        int[] A = new int[N];
        int ans = 0;
        for (int i = 0; i < M; i++) {
            A[0] = i;
            ans = Math.max(ans, dfs(A, 0, M, Q, a, b, c, d));
        }
        System.out.println(ans);
    }

    private static int dfs(int[] A, int i, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (i == A.length - 1) {
            return IntStream.range(0, Q).map(j -> A[b[j] - 1] - A[a[j] - 1] == c[j] ? d[j] : 0).sum();
        }
        int ans = 0;
        for (int j = 0; j < M; j++) {
            if (j < A[i]) {
                continue;
            }
            A[i + 1] = j;
            ans = Math.max(ans, dfs(A, i + 1, M, Q, a, b, c, d));
        }
        return ans;
    }
}