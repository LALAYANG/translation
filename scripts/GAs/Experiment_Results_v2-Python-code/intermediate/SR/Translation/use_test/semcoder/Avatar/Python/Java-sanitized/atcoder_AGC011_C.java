import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int neighbor = sc.nextInt();
            g[u].add(neighbor);
            g[neighbor].add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else if (depthFirstSearch(i, vis, g)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }

        int result = ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb;
        System.out.println(result);
    }

    private static boolean depthFirstSearch(int x, int[] vis, List<Integer>[] g) {
        vis[x] = 1;
        for (int i : g[x]) {
            if (vis[i] == 0) {
                vis[i] = 3 - vis[x];
                if (!depthFirstSearch(i, vis, g)) {
                    return false;
                }
            } else if (vis[i] == vis[x]) {
                return false;
            }
        }
        return true;
    }
}