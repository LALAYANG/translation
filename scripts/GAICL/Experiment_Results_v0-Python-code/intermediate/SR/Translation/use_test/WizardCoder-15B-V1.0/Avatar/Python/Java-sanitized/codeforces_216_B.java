import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = new int[n + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a][b] = 1;
            g[b][a] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean[] seen = new boolean[n + 1];
            int[] dfs = dfs(g, seen, i);
            if (dfs[0] > 1 && dfs[0] % 2 == 1 && dfs[1] == dfs[0] * 2) {
                ans++;
            }
        }
        if (n % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static int[] dfs(int[][] g, boolean[] seen, int i) {
        if (seen[i]) {
            return new int[]{0, 0};
        }
        seen[i] = true;
        int nodes = 1;
        int edges = 0;
        for (int j = 1; j <= g.length; j++) {
            if (g[i][j] == 1) {
                int[] dfs_j = dfs(g, seen, j);
                nodes += dfs_j[0];
                edges += dfs_j[1];
            }
        }
        return new int[]{nodes, edges + nodes};
    }
}