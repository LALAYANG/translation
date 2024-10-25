import java.util.*;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        int n = inp();
        int ta = inp();
        int ao = inp();
        ta -= 1;
        ao -= 1;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = inp();
            int b = inp();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
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

    public static void dfs(List<List<Integer>> g, int node, int[] dist) {
        for (int v : g.get(node)) {
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist);
        }
    }

    public static int inp() {
        return Integer.parseInt(System.console().readLine());
    }

    public static List<Integer> inpl() {
        String[] tokens = System.console().readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }
        return list;
    }
}