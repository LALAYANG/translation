import java.util.*;

public class atcoder_ABC133_E {
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
        int ans = dfs(graph, 0, N, K, mod);
        System.out.println(ans);
    }

    public static int dfs(int[][] graph, int node, int N, int K, int mod) {
        if (node == N - 1) {
            return 1;
        }
        int caseNum = 1;
        int colorNum = K - 1;
        for (int i = 0; i < N; i++) {
            if (i == node) {
                continue;
            }
            if (graph[node][i] == 1) {
                int pat = dfs(graph, i, N, colorNum, mod);
                if (pat == 0) {
                    return 0;
                }
                caseNum = (caseNum * pat) % mod;
                colorNum--;
            }
        }
        return caseNum;
    }
}