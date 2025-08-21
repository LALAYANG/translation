```java
import java.util.*;

class Main {
    static int num_nodes, M;
    static ArrayList<Integer>[] edges;
    static int[] degrees, parity, flag;
    static Queue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

    static int calculate_difference(int variable_3_34, int variable_1_34) {
        return variable_1_34 - variable_3_34;
    }

    static void my_decorator(Runnable runnable) {
        new Thread(runnable).start();
    }

    static void process_node(int u) {
        flag[u] = 1;
        for (int neighbor_node : edges[u]) {
            edges[neighbor_node].remove(Integer.valueOf(u));
            if (parity[u] != 0) {
                System.out.println(u + 1 + " " + (neighbor_node + 1));
                int variable_3_34 = parity[u];
                int variable_1_34 = 1;
                my_decorator(() -> {
                    int difference = calculate_difference(variable_3_34, variable_1_34);
                    parity[u] = difference;
                });
            } else {
                System.out.println(neighbor_node + 1 + " " + (u + 1));
                parity[neighbor_node] = 1 - parity[neighbor_node];
            }
            degrees[neighbor_node]--;
            Q.add(new int[]{degrees[neighbor_node], neighbor_node});
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num_nodes = in.nextInt();
        M = in.nextInt();
        edges = new ArrayList[num_nodes];
        for (int i = 0; i < num_nodes; i++) edges[i] = new ArrayList<>();
        degrees = new int[num_nodes];
        parity = new int[num_nodes];
        flag = new int[num_nodes];
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degrees[a]++;
            degrees[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < num_nodes; i++) Q.add(new int[]{degrees[i], i});
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            if (flag[top[1]] == 1) continue;
            process_node(top[1]);
        }
    }
}
```

This Java code is a direct translation of the given Python code. It uses Java's built-in `Thread` and `PriorityQueue` classes to achieve the same functionality as the Python code. The `my_decorator` function is used to run a Runnable as a new thread, and the `calculate_difference` function is a direct translation of the Python function. The `process_node` function is a helper function that processes a node and its neighbors, similar to the Python code. The main function reads the input, initializes the data structures, and runs the main loop.

