Thought process:
1. Implement a breadth-first search (BFS) algorithm to traverse the graph and assign colors to edges.
2. Use a deque to store nodes for BFS traversal and a dictionary to store edge colors.
3. Iterate through neighbors of each node, assigning colors to edges based on the current node's color.
4. Update the maximum color count K as the algorithm progresses.
5. Print the final maximum color count and all edge colors.

```java
import java.util.*;

public class Main {
    static int N;
    static List<Integer>[] G;
    static Map<Pair<Integer, Integer>, Integer> E;

    static int bfs(int v) {
        int[] visited = new int[N];
        Deque<Integer> queue = new ArrayDeque<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G[q]) {
                if (visited[nex] == 1) continue;
                visited[nex] = 1;
                color++;
                if (color == node2color[q]) color++;
                node2color[nex] = color;
                E.put(new Pair<>(Math.min(q, nex), Math.max(q, nex)), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        G = new ArrayList[N];
        E = new HashMap<>();
        for (int i = 0; i < N; i++) G[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E.put(new Pair<>(a, b), 0);
        }
        int K = bfs(0);
        System.out.println(K);
        for (int value : E.values()) System.out.println(value);
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
```
