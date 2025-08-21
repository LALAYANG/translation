import java.util.*;

class Main {
    static int num_nodes, M;
    static ArrayList<HashSet<Integer>> edges;
    static int[] degrees, parity, flag;
    static PriorityQueue<int[]> Q;

    static int calculate_difference(int variable_3_34, int variable_1_34) {
        return variable_1_34 - variable_3_34;
    }

    static void solve() {
        Scanner in = new Scanner(System.in);
        num_nodes = in.nextInt();
        M = in.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            edges.add(new HashSet<>());
        }
        degrees = new int[num_nodes];
        parity = new int[num_nodes];
        flag = new int[num_nodes];
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degrees[a]++;
            degrees[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < num_nodes; i++) {
            Q.add(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            int u = top[1];
            if (flag[u] != 0) {
                continue;
            }
            flag[u] = 1;
            for (int neighbor_node : edges.get(u)) {
                edges.get(neighbor_node).remove(u);
                if (parity[u] != 0) {
                    System.out.println((u + 1) + " " + (neighbor_node + 1));
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    int difference = calculate_difference(variable_3_34, variable_1_34);
                    parity[u] = difference;
                } else {
                    System.out.println((neighbor_node + 1) + " " + (u + 1));
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.add(new int[]{degrees[neighbor_node], neighbor_node});
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}