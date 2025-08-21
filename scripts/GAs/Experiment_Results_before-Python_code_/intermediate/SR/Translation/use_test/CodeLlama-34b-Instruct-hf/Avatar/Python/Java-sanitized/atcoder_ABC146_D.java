import java.util.*;

public class atcoder_ABC146_D {
    public static int bfs(int v, int N, List<List<Integer>> G, Map<Pair<Integer, Integer>, Integer> E) {
        boolean[] visited = new boolean[N];
        Deque<Integer> queue = new ArrayDeque<>();
        int K = -1;
        int[] node2color = new int[N];
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.remove();
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
                E.put(new Pair<>(Math.min(q, nex), Math.max(q, nex)), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        Map<Pair<Integer, Integer>, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(new Pair<>(Math.min(a, b), Math.max(a, b)), 0);
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }
}