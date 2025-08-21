```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int num_nodes = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < num_nodes; i++) {
            edges.add(new HashSet<>());
        }
        int[] degrees = new int[num_nodes];
        int[] parity = new int[num_nodes];
        boolean[] flag = new boolean[num_nodes];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int node_b = scanner.nextInt();
            edges.get(a - 1).add(node_b - 1);
            edges.get(node_b - 1).add(a - 1);
            degrees[a - 1]++;
            degrees[node_b - 1]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < num_nodes; i++) {
            Q.add(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] pair = Q.poll();
            int u = pair[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int neighbor_node : edges.get(u)) {
                edges.get(neighbor_node).remove(u);
                if (parity[u] != 0) {
                    System.out.println((u + 1) + " " + (neighbor_node + 1));
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> calculateDifference(variable_3_34, variable_1_34));
                    parity[u] = future.get();
                    executor.shutdown();
                } else {
                    System.out.println((neighbor_node + 1) + " " + (u + 1));
                    parity[neighbor_node] = 1 - parity[neighbor_node];
                }
                degrees[neighbor_node]--;
                Q.add(new int[]{degrees[neighbor_node], neighbor_node});
            }
        }
    }

    private static int calculateDifference(int variable_3_34, int variable_1_34) {
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return variable_1_34 - variable_3_34;
    }
}
```

