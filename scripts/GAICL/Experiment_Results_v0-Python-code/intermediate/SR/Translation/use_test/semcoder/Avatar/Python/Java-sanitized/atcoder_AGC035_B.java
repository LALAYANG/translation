import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int M = sc.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            edges.add(new HashSet<>());
        }
        int[] degrees = new int[num_nodes];
        int[] parity = new int[num_nodes];
        boolean[] flag = new boolean[num_nodes];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int node_b = sc.nextInt() - 1;
            edges.get(a).add(node_b);
            edges.get(node_b).add(a);
            degrees[a]++;
            degrees[node_b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        Queue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < num_nodes; i++) {
            Q.offer(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] curr = Q.poll();
            int u = curr[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int i = 0; i < edges.get(u).size(); i++) {
                int neighbor_node = edges.get(u).iterator().next();
                edges.get(neighbor_node).remove(u);
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (neighbor_node + 1));
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    Queue<Integer> queue_calculate_difference0 = new LinkedList<>();

                    Thread calculate_difference_thread = new Thread(() -> {
                        int difference = calculate_difference(variable_3_34, variable_1_34);
                        queue_calculate_difference0.add(difference);
                    });
                    calculate_difference_thread.start();
                    try {
                        calculate_difference_thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int result_calculate_difference0 = queue_calculate_difference0.poll();
                    parity[u] = result_calculate_difference0;
                } else {
                    System.out.println((neighbor_node + 1) + " " + (u + 1));
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.offer(new int[]{degrees[neighbor_node], neighbor_node});
            }
        }
    }

    static int calculate_difference(int variable_3_34, int variable_1_34) {
        return variable_1_34 - variable_3_34;
    }
}