```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] vis;
    static int ci, cb, cc;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        while (!stk.empty()) {
            int[] top = stk.pop();
            int u = top[0], col = top[1];
            if (vis[u] != 0) {
                if (vis[u] != col) {
                    return false;
                }
                continue;
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return true;
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
                } else {
                    if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println((long)ci * ci + 2 * ci * (n - ci) + (long)cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of nodes and edges, and then reads the edges. It then performs a depth-first search to find connected components, and counts the number of components of size 0, 1, and more. Finally, it calculates and prints the result as per the formula provided in the problem statement.

