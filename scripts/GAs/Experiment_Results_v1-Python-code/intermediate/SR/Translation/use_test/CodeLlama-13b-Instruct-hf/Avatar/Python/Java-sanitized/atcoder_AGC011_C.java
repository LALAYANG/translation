import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        int n = 100000;
        int m = 59037;
        int[] visited = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n + 1; i++) {
            visited[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int u = (int) (Math.random() * n);
            int v = (int) (Math.random() * n);
            queue.add(u);
            queue.add(v);
        }
        int ci = 0;
        int cb = 0;
        int cc = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (visited[u] == 0) {
                if (queue.size() == 0) {
                    ci++;
                } else {
                    dfs(u, visited, queue);
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static void dfs(int u, int[] visited, Queue<Integer> queue) {
        visited[u] = 1;
        for (int i = 0; i < queue.size(); i++) {
            int v = queue.poll();
            if (visited[v] == 0) {
                visited[v] = 1;
                dfs(v, visited, queue);
            }
        }
    }
}