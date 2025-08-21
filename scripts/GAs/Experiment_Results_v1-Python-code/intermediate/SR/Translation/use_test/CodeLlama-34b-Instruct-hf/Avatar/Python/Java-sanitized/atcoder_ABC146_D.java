import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<List<Integer>> G = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(args[i * 2 + 1]) - 1;
            int b = Integer.parseInt(args[i * 2 + 2]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
        }
        int K = breadthFirstSearch(0, N, G);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                System.out.print(G.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static int breadthFirstSearch(int v, int N, List<List<Integer>> G) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G.get(q)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}