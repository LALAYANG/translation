import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[][] G = new int[N][];
        for (int i = 0; i < N - 1; i++) {
            String[] tokens = args[i + 1].split(" ");
            int a = Integer.parseInt(tokens[0]) - 1;
            int b = Integer.parseInt(tokens[1]) - 1;
            G[a][b] = 1;
            G[b][a] = 1;
        }
        int[] visited = new int[N];
        int[] node2color = new int[N];
        int K = -1;
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(0);
        visited[0] = 1;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int color = 0;
            for (int nex : G[currentNode]) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[currentNode]) {
                    color++;
                }
                node2color[nex] = color;
                K = Math.max(K, color);
                queue.add(nex);
            }
        }
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            System.out.println(node2color[i]);
        }
    }
}