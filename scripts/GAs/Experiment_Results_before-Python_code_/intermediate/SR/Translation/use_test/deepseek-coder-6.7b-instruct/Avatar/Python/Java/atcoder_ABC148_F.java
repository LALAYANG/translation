Here is the Java version of the Python code:

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
        ta--; ao--;
        g = new ArrayList[n];
        for(int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for(int i = 0; i < n - 1; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1, b = Integer.parseInt(s[1]) - 1;
            g[a].add(b);
            g[b].add(a);
        }
        ta_dist = new int[n];
        ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        ta_dfs(ta);
        ao_dfs(ao);
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void ta_dfs(int node) {
        for(int v : g[node]) {
            if(ta_dist[v] != -1) continue;
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }

    static void ao_dfs(int node) {
        for(int v : g[node]) {
            if(ao_dist[v] != -1) continue;
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates the graph, and performs depth-first search (DFS) to calculate the distances from the target and the ao node to all other nodes. Then it finds the maximum distance and prints it.

