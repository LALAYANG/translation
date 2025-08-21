import java.util.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] G = new int[N][N];
        int[][] E = new int[N][N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G[a][b] = 1;
            G[b][a] = 1;
            E[a][b] = 0;
            E[b][a] = 0;
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int bfs(int v, int N, int[][] G, int[][] E) {
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = 1;
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex = 0; nex < N; nex++) {
                if (G[q][nex] == 1 && visited[nex] == 0) {
                    visited[nex] = 1;
                    color++;
                    if (color == node2color[q]) {
                        color++;
                    }
                    node2color[nex] = color;
                    E[Math.min(q, nex)][max(q, nex)] = color;
                    queue.add(nex);
                }
            }
            K = Math.max(K, color);
        }
        return K;
    }
}