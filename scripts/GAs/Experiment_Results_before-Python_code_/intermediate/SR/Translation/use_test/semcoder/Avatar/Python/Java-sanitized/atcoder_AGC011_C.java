import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int[] u = stk.pop();
            if (vis[u[0]] != 0) {
                flag &= (vis[u[0]] == u[1]);
                continue;
            }
            vis[u[0]] = u[1];
            for (int i : g[u[0]]) {
                stk.push(new int[]{i, 3 - u[1]});
            }
        }
        return flag;
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
        int ci = 0, cb = 0, cc = 0;
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        long ans = (long) ci * ci + 2 * ci * (n - ci) + (long) cc * cc + 2 * cb * cc + 2 * cb * cb;
        System.out.println(ans);
    }
}