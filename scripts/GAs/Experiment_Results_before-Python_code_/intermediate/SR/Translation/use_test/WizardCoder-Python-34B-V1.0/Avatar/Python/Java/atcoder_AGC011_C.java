```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        boolean[][] adjMatrix = new boolean[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                adjMatrix[i][j] = false;
            }
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = true;
            adjMatrix[v][u] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (isConnected(adjMatrix, i, vis)) {
                    ci++;
                } else {
                    if (dfs(adjMatrix, i, vis)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + 2 * cb * cc + cc * cc);
    }

    public static boolean isConnected(boolean[][] adjMatrix, int x, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        vis[x] = 1;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 1; v <= n; v++) {
                if (adjMatrix[u][v] && vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    q.add(v);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean dfs(boolean[][] adjMatrix, int x, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        vis[x] = 1;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 1; v <= n; v++) {
                if (adjMatrix[u][v] && vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    q.add(v);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
``` 
