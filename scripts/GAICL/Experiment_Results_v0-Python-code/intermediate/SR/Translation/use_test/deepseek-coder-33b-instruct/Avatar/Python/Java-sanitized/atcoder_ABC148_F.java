import java.util.*;

public class atcoder_ABC148_F {
    static int n, ta, ao;
    static ArrayList<Integer>[] g;
    static Integer[] ta_dist, ao_dist;

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
        ta_dist = new Integer[n];
        ao_dist = new Integer[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        ao_dfs(ao);
        ta_dfs(ta);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void ta_dfs(int node) {
        for (int v : g[node]) {
            if (ta_dist[v] != null) {
                continue;
            }
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(v);
        }
    }

    static void ao_dfs(int node) {
        for (int v : g[node]) {
            if (ao_dist[v] != null) {
                continue;
            }
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(v);
        }
    }
}