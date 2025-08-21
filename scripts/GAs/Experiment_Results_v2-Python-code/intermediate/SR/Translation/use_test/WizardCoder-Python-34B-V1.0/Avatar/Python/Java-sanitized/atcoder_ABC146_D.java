import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] E = new int[N][N];
        LinkedList<Integer>[] G = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new LinkedList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E[a][b] = 0;
        }
        int K = graphColoring(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (E[i][j] != 0) {
                    System.out.print(E[i][j] + " ");
                }
            }
        }
    }

    public static int graphColoring(int v, int N, LinkedList<Integer>[] G, int[][] E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(v);
        visited[v] = true;
        int K = -1;
        int[] node2color = new int[N];
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G[q]) {
                if (!visited[nex]) {
                    visited[nex] = true;
                    color++;
                    if (node2color[q] == color) {
                        color++;
                    }
                    node2color[nex] = color;
                    E[Math.min(q, nex)][Math.max(q, nex)] = color;
                    queue.add(nex);
                }
            }
            K = Math.max(K, color);
        }
        return K;
    }
}