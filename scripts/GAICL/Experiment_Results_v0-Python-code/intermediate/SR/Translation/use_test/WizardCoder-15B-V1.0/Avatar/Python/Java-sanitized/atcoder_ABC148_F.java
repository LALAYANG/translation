import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class atcoder_ABC148_F {
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
        dfs(g, ta, ta_dist);
        dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void dfs(int[][] g, int s, int[] dist) {
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[s] + 1;
            for (int w : g[v]) {
                stack.push(w);
            }
        }
    }
}