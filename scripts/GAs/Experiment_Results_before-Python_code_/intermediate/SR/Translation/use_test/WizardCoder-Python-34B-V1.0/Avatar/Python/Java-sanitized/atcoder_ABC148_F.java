import java.util.*;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;

        dfs(g, ta, ta_dist, ta);
        dfs(g, ao, ao_dist, ao);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                res = Math.max(res, ao_dist[i]);
            }
        }
        System.out.println(res - 1);
    }

    public static void dfs(List<List<Integer>> g, int node, int[] dist, int start) {
        for (int v : g.get(node)) {
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist, start);
        }
    }
}