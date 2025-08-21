import java.util.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        Map<Integer, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(Math.min(a, b) * N + Math.max(a, b), 0);
        }
        int K = Func_bfs_0(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }

    public static int Func_bfs_0(int v, int N, List<List<Integer>> G, Map<Integer, Integer> E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int color = 0;
            int alwaysTrue = 1;
            for (int nex : G.get(currentNode)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[currentNode]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(Math.min(currentNode, nex) * N + Math.max(currentNode, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}