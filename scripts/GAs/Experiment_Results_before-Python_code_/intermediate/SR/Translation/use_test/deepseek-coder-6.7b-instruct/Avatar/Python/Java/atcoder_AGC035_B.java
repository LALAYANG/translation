```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degs[a]++;
            degs[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] u = Q.poll();
            if (flag[u[1]]) {
                continue;
            }
            flag[u[1]] = true;
            List<Integer> neighbors = new ArrayList<>(edges.get(u[1]));
            for (int v : neighbors) {
                edges.get(v).remove(Integer.valueOf(u[1]));
                if (parity[u[1]] != 0) {
                    System.out.println((u[1] + 1) + " " + (v + 1));
                    parity[u[1]] = 1 - parity[u[1]];
                } else {
                    System.out.println((v + 1) + " " + (u[1] + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(new int[]{degs[v], v});
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of nodes and edges, and then reads the edges. If the number of edges is odd, it prints -1 and exits. Otherwise, it creates a priority queue of nodes, and then processes the nodes in order of their degree. For each node, it removes it from the queue, marks it as processed, and then processes its neighbors. It prints the edge to each neighbor, and then adds the neighbor to the queue.

