import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinkedList<LinkedList<Integer>> G = new LinkedList<>();
        HashMap<Integer, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(a, b, 0);
        }
        BlockingQueue<Integer> queue = new BlockingQueue<>();
        Thread thread = new Thread(() -> {
            int K = Func_bfs_0(0, N, G, E);
            queue.put(K);
        });
        thread.start();
        try {
            int result = queue.take();
            System.out.println(result);
            for (int value : E.values()) {
                System.out.println(value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FunctionalInterface
    public static int Func_bfs_0(int v, int N, LinkedList<LinkedList<Integer>> G, HashMap<Integer, Integer> E) {
        boolean[] visited = new boolean[N];
        LinkedList<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int current_node = queue.removeFirst();
            int color = 0;
            boolean is_valid = true;
            boolean always_true = true;
            for (int nex : G.get(current_node)) {
                if (is_valid && always_true) {
                    if (visited[nex]) {
                        continue;
                    }
                }
                visited[nex] = true;
                color++;
                if (color == node2color[current_node]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(Math.min(current_node, nex), Math.max(current_node, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}