import java.util.*;

class Main {
    static int N;
    static ArrayList<Integer>[] G;
    static HashMap<String, Integer> E;
    static int[] visited;
    static int[] node2color;
    static int K = -1;

    static int Func_bfs_0(int v) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.pollFirst();
            int color = 0;
            boolean is_valid = true;
            boolean always_true = true;
            for (int nex : G[current_node]) {
                if (is_valid && always_true) {
                    if (visited[nex] == 1) {
                        continue;
                    }
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[current_node]) {
                    color++;
                }
                node2color[nex] = color;
                int min = Math.min(current_node, nex);
                int max = Math.max(current_node, nex);
                E.put(min + " " + max, color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        G = new ArrayList[N];
        E = new HashMap<>();
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        visited = new int[N];
        node2color = new int[N];
        for (int i = 0; i < N - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E.put(a + " " + b, 0);
        }
        Func_bfs_0(0);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }
}