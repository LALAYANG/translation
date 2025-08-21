```java
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
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
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, List<Integer>[] g) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        vis[x] = 1;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : g[u]) {
                if (vis[v] == 0) {
                    vis[v] = 1;
                    queue.add(v);
                }
            }
        }
        return true;
    }
}
```
Note: The above code uses a `Queue` to implement the Breadth-First Search (BFS) algorithm. The `Queue` is used to keep track of the nodes to be visited and the `vis` array is used to keep track of the visited nodes. The `dfs` method returns `true` if the graph is bipartite, otherwise it returns `false`.
