```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;
        int[][] g = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a][b] = 1;
            g[b][a] = 1;
        }
        int[] ta_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        int[] ao_dist = new int[n];
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(g, ta, ta_dist);
        dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void dfs(int[][] g, int s, int[] dist) {
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int v = 0; v < g.length; v++) {
                if (g[u][v] == 1 && dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    stack.push(v);
                }
            }
        }
    }
}
```
