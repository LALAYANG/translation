import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        int num_nodes, M;
        String[] input = "5 5".split(" ");
        num_nodes = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[][] edges = new int[num_nodes][];
        int[] degrees = new int[num_nodes];
        int[] parity = new int[num_nodes];
        boolean[] flag = new boolean[num_nodes];
        PriorityQueue<int[]> Q = new PriorityQueue<>(num_nodes, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < num_nodes; i++) {
            edges[i] = new int[0];
            degrees[i] = 0;
            parity[i] = 0;
            flag[i] = false;
        }
        for (int i = 0; i < M; i++) {
            String[] edge = "1 2\n2 3\n3 4\n2 5\n4 5".split("\n");
            String[] nodes = edge[i].split(" ");
            int a = Integer.parseInt(nodes[0]) - 1;
            int node_b = Integer.parseInt(nodes[1]) - 1;
            edges[a].push(node_b);
            edges[node_b].push(a);
            degrees[a]++;
            degrees[node_b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < num_nodes; i++) {
            Q.add(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            int u = top[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int neighbor_node : edges[u]) {
                edges[neighbor_node].remove(u);
                if (parity[u] != 0 && degrees[u] == 1) {
                    System.out.println((u + 1) + " " + (neighbor_node + 1));
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    int result_calculate_difference0 = calculateDifference(variable_3_34, variable_1_34);
                    parity[u] = result_calculate_difference0;
                } else {
                    System.out.println((neighbor_node + 1) + " " + (u + 1));
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.add(new int[]{degrees[neighbor_node], neighbor_node});
            }
        }
    }

    public static int calculateDifference(int variable_3_34, int variable_1_34) {
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return variable_1_34 - variable_3_34;
    }
}