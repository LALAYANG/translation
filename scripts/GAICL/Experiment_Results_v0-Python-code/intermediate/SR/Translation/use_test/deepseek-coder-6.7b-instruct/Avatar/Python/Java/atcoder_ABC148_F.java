```java
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] g;
    static int[] ta_dist, ao_dist;
    static int n, ta, ao;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        ta = Integer.parseInt(s[1]);
        ao = Integer.parseInt(s[2]);
        ta--;
        ao--;
        g = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            g[a].add(b);
            g[b].add(a);
        }
        ta_dist = new int[n];
        ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(ta, ta_dist);
        dfs(ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i])
                continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void dfs(int node, int[] dist) {
        Stack<Integer> st = new Stack<>();
        st.push(node);
        while (!st.isEmpty()) {
            int u = st.pop();
            for (int v : g[u]) {
                if (dist[v] != -1)
                    continue;
                dist[v] = dist[u] + 1;
                st.push(v);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, sets up the graph, and then performs depth-first search (DFS) from both the `ta` and `ao` nodes. It then finds the maximum distance from `ao` to any node, and prints this value minus 1.

