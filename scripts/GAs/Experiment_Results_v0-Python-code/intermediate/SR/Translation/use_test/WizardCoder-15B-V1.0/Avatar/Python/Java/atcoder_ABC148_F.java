```java
import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;
        int[][] g = new int[n][];
        for (int i = 0; i < n; i++) {
            g[i] = new int[0];
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a] = Arrays.copyOf(g[a], g[a].length + 1);
            g[a][g[a].length - 1] = b;
            g[b] = Arrays.copyOf(g[b], g[b].length + 1);
            g[b][g[b].length - 1] = a;
        }
        int[] ta_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        int[] ao_dist = new int[n];
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        ta_dfs(ta, g, ta_dist);
        ao_dfs(ao, g, ao_dist);
        int max_dist_from_ao = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            max_dist_from_ao = Math.max(max_dist_from_ao, ao_dist[i]);
        }
        System.out.println(max_dist_from_ao - 1);
    }

    public static void ta_dfs(int node, int[][] g, int[] ta_dist) {
        for (int v : g[node]) {
            if (ta_dist[v] != -1) {
                continue;
            }
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v, g, ta_dist);
        }
    }

    public static void ao_dfs(int node, int[][] g, int[] ao_dist) {
        for (int v : g[node]) {
            if (ao_dist[v] != -1) {
                continue;
            }
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v, g, ao_dist);
        }
    }
}
```
