import java.util.Scanner;
import java.util.Stack;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][v] = 1;
            g[v][u] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                if (g[i].length == 0) {
                    ci++;
                } else if (dfs(i, g, visited)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[][] g, int[] visited) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            if (visited[u] != 0) {
                flag &= visited[u] == visited[x];
                continue;
            }
            visited[u] = visited[x] == 1 ? 2 : 1;
            for (int i = 1; i < g[u].length; i++) {
                if (g[u][i] == 1) {
                    stk.push(i);
                }
            }
        }
        return flag;
    }
}