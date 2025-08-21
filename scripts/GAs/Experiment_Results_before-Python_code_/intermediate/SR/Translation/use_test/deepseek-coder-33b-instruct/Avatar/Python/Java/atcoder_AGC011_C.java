```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] vis;
    static int ci, cb, cc;
    static ArrayList<Integer>[] g;

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
                } else {
                    if (dfs(i, 1)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println((long) ci * ci + 2 * ci * (n - ci) + (long) cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    static boolean dfs(int x, int col) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, col});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.peek()[0];
            int c = stk.peek()[1];
            stk.pop();
            if (vis[u] != 0) {
                flag &= (vis[u] == c);
                continue;
            }
            vis[u] = c;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - c});
            }
        }
        return flag;
    }
}
```

