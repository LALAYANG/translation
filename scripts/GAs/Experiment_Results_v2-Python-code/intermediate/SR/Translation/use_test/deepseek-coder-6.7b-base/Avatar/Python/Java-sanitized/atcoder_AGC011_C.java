import java.util.Scanner;
import java.util.Stack;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0;
        int cb = 0;
        int cc = 0;
        int[][] g = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int neighbor = sc.nextInt();
            g[u][neighbor] = 1;
            g[neighbor][u] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].length == 0) {
                    ci++;
                } else if (depthFirstSearch(i, vis, g)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean depthFirstSearch(int x, int[] vis, int[][] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            if (vis[u] == 1) {
                flag &= vis[u] == 1;
                continue;
            }
            vis[u] = 1;
            for (int i = 1; i < g[u].length; i++) {
                if (g[u][i] == 1) {
                    stk.push(i);
                }
            }
        }
        return flag;
    }
}