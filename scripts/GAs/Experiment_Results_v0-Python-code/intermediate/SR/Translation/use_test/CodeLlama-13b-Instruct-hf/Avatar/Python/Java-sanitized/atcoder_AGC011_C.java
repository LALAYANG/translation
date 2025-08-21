import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        int n = 100000;
        int m = 59037;
        int[][] graph = new int[n + 1][n + 1];
        int[] vis = new int[n + 1];
        int ci = 0;
        int cb = 0;
        int cc = 0;

        for (int i = 0; i < m; i++) {
            int u = (int) (Math.random() * n);
            int v = (int) (Math.random() * n);
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (graph[i].length == 0) {
                    ci++;
                } else if (isBipartite(graph, i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    private static boolean isBipartite(int[][] graph, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        vis[node] = 1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : graph[u]) {
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    queue.add(v);
                } else if (vis[v] == vis[u]) {
                    return false;
                }
            }
        }

        return true;
    }
}