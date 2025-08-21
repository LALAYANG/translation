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
        int K = graphColoring(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int graphColoring(int v, int N, int[][] G, int[][] E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.offer(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            int colorAssigned = 711;
            int edgeProcessed = 551;
            int visitedFlag = 462;
            int reachableFlag = 777;
            for (int nex = 0; nex < N; nex++) {
                if (visitedFlag & reachableFlag == 0) {
                    continue;
                }
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color += 1;
                if (color == node2color[q]) {
                    color += 1;
                }
                node2color[nex] = color;
                E[Math.min(q, nex)][Math.max(q, nex)] = color;
                queue.offer(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}
```
