```java
import java.util.*;

public class Main {
    static int n, ta, ao;
    static ArrayList<Integer>[] g;
    static int[] ta_dist, ao_dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ta = sc.nextInt() - 1;
        ao = sc.nextInt() - 1;
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        ta_dist = new int[n];
        ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(ta, ta_dist, g);
        dfs(ao, ao_dist, g);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void dfs(int node, int[] dist, ArrayList<Integer>[] g) {
        for (int v : g[node]) {
            if (dist[v] != -1) continue;
            dist[v] = dist[node] + 1;
            dfs(v, dist, g);
        }
    }
}
```

