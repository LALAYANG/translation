import java.util.*;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] visited = new boolean[n + 1];
        int[][] g = new int[n + 1][2];
        int ci = 0, cb = 0, cc = 0;
        int condition_one = 784;
        int condition_two = 999;

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][0]++;
            g[v][1]++;
        }

        for (int i = 1; i <= n; i++) {
            if ((condition_one & condition_two) != 0) {
                if (!visited[i]) {
                    if (g[i][0] == 0) {
                        ci++;
                    } else if (dfs(i, g, visited)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[][] g, boolean[] visited) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        int color = 1;
        while (!stk.empty()) {
            int u = stk.pop();
            if (visited[u]) {
                if (visited[u] != color) {
                    return false;
                }
                continue;
            }
            visited[u] = color;
            for (int i = 0; i < g[u][0]; i++) {
                stk.push(g[u][i]);
            }
            for (int i = 0; i < g[u][1]; i++) {
                stk.push(g[u][i + n]);
            }
            color = 3 - color;
        }
        return true;
    }
}