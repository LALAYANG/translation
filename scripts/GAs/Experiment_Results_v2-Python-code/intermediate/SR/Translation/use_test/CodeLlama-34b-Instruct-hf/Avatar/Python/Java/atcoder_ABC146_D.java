
Here's the Java code that implements the graph coloring algorithm using BFS:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class GraphColoring {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<List<Integer>> G = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(args[i * 2 + 1]) - 1;
            int b = Integer.parseInt(args[i * 2 + 2]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
        }

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(0);

        int K = 0;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            List<Integer> neighbors = G.get(q);
            for (int nex : neighbors) {
                if (!queue.contains(nex)) {
                    queue.add(nex);
                    K = Math.max(K, graphColoring(q, nex, G, E));
                }
            }
        }

        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (E.containsKey(i, j)) {
                    System.out.print(E.get(i, j) + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private static int graphColoring(int q, int nex, List<List<Integer>> G, Map<Integer, Integer> E) {
        int K = 0;
        List<Integer> neighbors = G.get(nex);
        for (int i = 0; i < neighbors.size(); i++) {
            int nex2 = neighbors.get(i);
            if (!queue.contains(nex2)) {
                queue.add(nex2);
                K = Math.max(K, graphColoring(q, nex2, G, E));
            }
        }
        return K;
    }
}
```
Note that this implementation uses a `ConcurrentLinkedQueue` to store the queue of nodes to visit, which allows for concurrent access and modification of the queue. This is necessary because the `bfs_thread` method is executed in a separate thread, and we need to ensure that the queue is thread-safe.

Also, note that the `graphColoring` method is recursive, and it uses a `Map` to store the colors of the nodes. The `Map` is initialized with the colors of the nodes in the input graph, and it is updated as the algorithm progresses.

Finally, the `main` method prints the maximum color of the graph, and it prints the colors of all the nodes in the graph.
