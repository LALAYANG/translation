```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer>[] edges = new HashSet[num_nodes];
        int[] degrees = new int[num_nodes];
        int[] parity = new int[num_nodes];
        boolean[] flag = new boolean[num_nodes];
        for (int i = 0; i < num_nodes; i++) {
            edges[i] = new HashSet<>();
            degrees[i] = 0;
            parity[i] = 0;
            flag[i] = false;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int node_b = sc.nextInt() - 1;
            edges[a].add(node_b);
            edges[node_b].add(a);
            degrees[a]++;
            degrees[node_b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < num_nodes; i++) {
            Q.offer(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] u = Q.poll();
            if (flag[u[1]]) {
                continue;
            }
            flag[u[1]] = true;
            for (int neighbor_node : edges[u[1]]) {
                edges[neighbor_node].remove(u[1]);
                if (parity[u[1]] != 0 && edges[u[1]].size() == 0) {
                    System.out.println(u[1] + 1 + " " + neighbor_node + 1);
                    int variable_3_34 = parity[u[1]];
                    int variable_1_34 = 1;
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    Future<Integer> future = executor.submit(() -> calculate_difference(variable_3_34, variable_1_34));
                    try {
                        int result_calculate_difference0 = future.get();
                        parity[u[1]] = result_calculate_difference0;
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                } else {
                    System.out.println(neighbor_node + 1 + " " + u[1] + 1);
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.offer(new int[]{degrees[neighbor_node], neighbor_node});
            }
        }
    }

    public static int calculate_difference(int variable_3_34, int variable_1_34) {
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return variable_1_34 - variable_3_34;
    }
}
```
