```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
        }
        int[] A = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = 1;
            ans = Math.max(ans, dfs(A, 0, Q, a, b, c, d));
            A[i] = 0;
        }
        System.out.println(ans);
    }

    public static int dfs(int[] A, int i, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (i == Q) {
            int ans = 0;
            for (int j = 0; j < Q; j++) {
                if (A[b[j] - 1] - A[a[j] - 1] == c[j]) {
                    ans += d[j];
                }
            }
            return ans;
        }
        int ans = 0;
        for (int j = 1; j <= A.length; j++) {
            A[i] = j;
            ans = Math.max(ans, dfs(A, i + 1, Q, a, b, c, d));
        }
        return ans;
    }
}
```

