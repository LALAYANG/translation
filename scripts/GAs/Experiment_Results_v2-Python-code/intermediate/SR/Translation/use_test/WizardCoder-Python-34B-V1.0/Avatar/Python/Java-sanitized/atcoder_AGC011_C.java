import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atcoder_AGC011_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0;
        int cb = 0;
        int cc = 0;
        boolean[][] adjMatrix = new boolean[n + 1][n + 1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int neighbor = scanner.nextInt();
            adjMatrix[u][neighbor] = true;
            adjMatrix[neighbor][u] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                queue.add(i);
                vis[i] = 1;
                while (!queue.isEmpty()) {
                    int u = queue.poll();
                    for (int j = 1; j <= n; j++) {
                        if (adjMatrix[u][j]) {
                            if (vis[j] == 0) {
                                vis[j] = 3 - vis[u];
                                queue.add(j);
                            } else if (vis[j] == vis[u]) {
                                System.out.println("Graph is not bipartite");
                                return;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                ci++;
            } else if (vis[i] == 1) {
                cb++;
            } else {
                cc++;
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}