```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = 0;
            }
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int mod = 1000000007;
        int ans = dfs(graph, 0, -1, K, mod);
        System.out.println(ans);
    }

    public static int dfs(int[][] graph, int fro, int to, int f, int mod) {
        if (f == 0) {
            return 1;
        }
        int caseNum = f;
        int colorNum = f - 1;
        for (int u = 0; u < graph.length; u++) {
            if (u == to) {
                continue;
            }
            int pat = dfs(graph, u, fro, colorNum, mod);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
            colorNum--;
        }
        return caseNum;
    }
}
```
