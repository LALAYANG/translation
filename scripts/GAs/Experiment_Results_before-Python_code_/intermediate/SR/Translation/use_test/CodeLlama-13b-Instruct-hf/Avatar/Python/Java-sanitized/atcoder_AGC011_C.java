import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g.get(i).size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, g, vis)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    private static boolean dfs(int u, List<List<Integer>> g, int[] vis) {
        boolean flag = true;
        for (int v : g.get(u)) {
            if (vis[v] == 0) {
                vis[v] = 1;
                flag &= dfs(v, g, vis);
            } else {
                flag &= (vis[v] == 1);
            }
        }
        return flag;
    }
}