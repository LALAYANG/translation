import java.util.ArrayList;
import java.util.Arrays;
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
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(0);
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int color = 0;
            for (int nex : G.get(currentNode)) {
                if (node2color[nex] == -1) {
                    node2color[nex] = color;
                    color++;
                    queue.add(nex);
                }
            }
            K = Math.max(K, color);
        }
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            System.out.println(node2color[i]);
        }
    }
}