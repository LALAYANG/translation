```java
import java.util.*;

public class Main {
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
        int[] dp = new int[M + 1];
        Arrays.fill(dp, 1);
        for (int i = 0; i < Q; i++) {
            dp[a[i] - 1] = Math.max(dp[a[i] - 1], c[i]);
            dp[b[i] - 1] = Math.max(dp[b[i] - 1], c[i]);
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }
        for (int i = 0; i < Q; i++) {
            if (dp[b[i] - 1] - dp[a[i] - 1] == c[i]) {
                res += d[i];
            }
        }
        System.out.println(res);
    }
}
```
