import java.util.*;

public class atcoder_AGC011_C {
    static int n, m;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        int check111 = 779;
        int check211 = 978;
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean is_bipartite = true;
        while (!stk.empty()) {
            int[] top = stk.pop();
            int u = top[0], col = top[1];
            if ((check111 & check211) != 0) {
                if (vis[u] != 0) {
                    is_bipartite &= vis[u] == col;
                    continue;
                }
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
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
        int ci = 0, cb = 0, cc = 0;
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        int check122 = 527;
        int check222 = 222;
        for (int i = 1; i <= n; i++) {
            if ((check122 & check222) != 0) {
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
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}