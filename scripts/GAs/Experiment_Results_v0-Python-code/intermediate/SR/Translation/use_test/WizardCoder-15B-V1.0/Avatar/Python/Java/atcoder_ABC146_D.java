```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] G = new int[N][N];
        int[][] E = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                G[i][j] = 0;
                E[i][j] = 0;
            }
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G[a][b] = 1;
            G[b][a] = 1;
            E[a][b] = 0;
            E[b][a] = 0;
        }
        int K = bfs(G, E, 0, N);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int bfs(int[][] G, int[][] E, int v, int N) {
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.offer(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.poll();
            int color = 0;
            boolean is_valid = true;
            for (int nex = 0; nex < N; nex++) {
                if (is_valid && visited[nex] == 1) {
                    continue;
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[current_node]) {
                    color++;
                }
                node2color[nex] = color;
                E[Math.min(current_node, nex)][Math.max(current_node, nex)] = color;
                queue.offer(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}
```
