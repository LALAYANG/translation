import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        boolean[][] g = new boolean[n + 1][n + 1];
        Queue<Integer> stk = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][v] = true;
            g[v][u] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                stk.add(i);
                vis[i] = 1;
                while (!stk.isEmpty()) {
                    int u = stk.poll();
                    for (int j = 1; j <= n; j++) {
                        if (g[u][j]) {
                            if (vis[j] == 0) {
                                stk.add(j);
                                vis[j] = 3 - vis[u];
                            } else if (vis[j] == vis[u]) {
                                cb = 0;
                                cc = 0;
                                break;
                            }
                        }
                    }
                }
                if (cb == 0 && cc == 0) {
                    if (vis[i] == 1) {
                        ci++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}