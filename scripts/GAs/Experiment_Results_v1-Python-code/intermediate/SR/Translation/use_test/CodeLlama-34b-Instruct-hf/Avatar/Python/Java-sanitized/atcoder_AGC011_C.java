import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] visited = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, g);
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static void dfs(int x, int[] visited, List<Integer>[] g) {
        Queue<Integer> stk = new LinkedList<>();
        stk.add(x);
        while (!stk.isEmpty()) {
            int u = stk.poll();
            if (visited[u] == 0) {
                visited[u] = 1;
                for (int i : g[u]) {
                    stk.add(i);
                }
            }
        }
    }
}