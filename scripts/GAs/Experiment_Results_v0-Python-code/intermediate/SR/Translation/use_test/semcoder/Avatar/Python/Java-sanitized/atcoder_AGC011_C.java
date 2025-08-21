import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static int ci, cb, cc;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        ArrayList<Integer> stk = new ArrayList<>();
        stk.add(x);
        boolean is_bipartite = true;
        while (!stk.isEmpty()) {
            int u = stk.remove(stk.size() - 1);
            int col = vis[u];
            if (vis[u] != 0) {
                is_bipartite &= vis[u] == col;
                continue;
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.add(i);
                vis[i] = 3 - col;
            }
        }
        return is_bipartite;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        vis = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else if (dfs(i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}