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
        int mod = (int) 1e9 + 7;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + dfs(graph, i, K, mod)) % mod;
        }
        System.out.println(ans);
    }

    public static int dfs(int[][] graph, int node, int K, int mod) {
        int[] dp = new int[K];
        Arrays.fill(dp, 1);
        for (int i = 0; i < K - 1; i++) {
            int[] temp = new int[K];
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < N; k++) {
                    if (graph[k][node] == 1) {
                        temp[j] = (temp[j] + dp[j]) % mod;
                    }
                }
            }
            dp = temp;
        }
        int ans = 1;
        for (int i = 0; i < K; i++) {
            ans = (ans * dp[i]) % mod;
        }
        return ans;
    }
}
```
