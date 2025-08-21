```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        Queue<Integer>[] g = new LinkedList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new LinkedList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int neighbor = sc.nextInt();
            g[u].add(neighbor);
            g[neighbor].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].isEmpty()) {
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

    public static boolean depthFirstSearch(int x, int[] vis, Queue<Integer>[] g) {
        Queue<Integer> stk = new LinkedList<>();
        stk.add(x);
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.poll();
            if (vis[u] != 0) {
                flag &= vis[u] == 1;
                continue;
            }
            vis[u] = 1;
            for (int neighbor : g[u]) {
                stk.add(neighbor);
            }
        }
        return flag;
    }
}
```
