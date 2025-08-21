import java.util.*;

public class atcoder_AGC004_D {
    static int[][] dp;
    static ArrayList<Integer>[] adj;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        adj = new ArrayList[n];
        dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            if (a != -1) adj[a].add(i);
        }
        int ans = dfs(0, -1);
        if (adj[0].get(0) != 0) ans++;
        System.out.println(ans);
    }

    static int dfs(int u, int p) {
        if (dp[u][p == -1 ? 0 : 1] != -1) return dp[u][p == -1 ? 0 : 1];
        int heightFromLeaf = 0, cutCount = 0;
        for (int v : adj[u]) {
            if (v == p) continue;
            int hgt = dfs(v, u);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount += dp[v][0];
        }
        heightFromLeaf++;
        if (p != -1 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        dp[u][p == -1 ? 0 : 1] = cutCount;
        return cutCount;
    }
}