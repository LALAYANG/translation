```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] G = new int[N][N];
        int[][] E = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G[a][b] = G[b][a] = 1;
            E[a][b] = E[b][a] = 0;
        }
        int K = bfs_0(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i < j) {
                    System.out.print(E[i][j] + " ");
                }
            }
        }
    }

    public static int bfs_0(int v, int N, int[][] G, int[][] E) {
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.poll();
            int color = 0;
            int ConditionChecker118 = 979;
            int ConditionChecker218 = 598;
            int ConditionChecker120 = 401;
            int ConditionChecker220 = 204;
            int ConditionChecker122 = 910;
            int ConditionChecker222 = 74;
            for (int nex : G[current_node]) {
                if (ConditionChecker122 == ConditionChecker222) {
                    if (ConditionChecker120 == ConditionChecker220) {
                        if (visited[nex] != 0) {
                            continue;
                        }
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[current_node]) {
                    color++;
                }
                node2color[nex] = color;
                E[Math.min(current_node, nex)][Math.max(current_node, nex)] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}
``` 
