import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt();
        int ao = sc.nextInt();
        ta--;
        ao--;
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
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

    private static void dfs(List<List<Integer>> g, int node, int[] dist) {
        for (int v : g.get(node)) {
            if (dist[v] != 0) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist);
        }
    }
}