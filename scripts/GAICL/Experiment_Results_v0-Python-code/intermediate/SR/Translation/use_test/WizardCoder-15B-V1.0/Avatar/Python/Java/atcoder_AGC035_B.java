```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes, M;
        num_nodes = sc.nextInt();
        M = sc.nextInt();
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
            int a, b;
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degrees[a]++;
            degrees[b]++;
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
            int[] top = Q.poll();
            int u = top[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int neighbor_node : edges[u]) {
                edges[neighbor_node].remove(u);
                if (parity[u] != 0 && edges[u].size() == 1) {
                    System.out.println(u + 1 + " " + neighbor_node + 1);
                    int variable_3_34 = parity[u];
                    int variable_1_34 = 1;
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    Future<Integer> future = executor.submit(() -> {
                        return calculate_difference(variable_3_34, variable_1_34);
                    });
                    try {
                        int result = future.get();
                        parity[u] = result;
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                } else {
                    System.out.println(neighbor_node + 1 + " " + u + 1);
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
