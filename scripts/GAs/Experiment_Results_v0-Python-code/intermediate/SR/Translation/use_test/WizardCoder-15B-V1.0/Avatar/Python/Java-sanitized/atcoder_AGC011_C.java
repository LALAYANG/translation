import java.util.*;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<Integer>[] g = new ArrayList[n + 1];
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
                } else if (isBipartite(g, vis, i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean isBipartite(List<Integer>[] g, int[] vis, int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        vis[u] = 1;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i : g[v]) {
                if (vis[i] == 0) {
                    vis[i] = 3 - vis[v];
                    q.add(i);
                } else if (vis[i] == vis[v]) {
                    return false;
                }
            }
        }
        return true;
    }
}