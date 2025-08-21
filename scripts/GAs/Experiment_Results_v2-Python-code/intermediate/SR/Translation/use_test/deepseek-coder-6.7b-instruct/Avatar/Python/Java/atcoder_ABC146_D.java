```java
import java.util.*;

class Main {
    static int N;
    static ArrayList<Integer>[] G;
    static HashMap<Integer, Integer> E;
    static int[] visited;
    static int K = -1;
    static int[] node2color;
    static Deque<Integer> queue = new ArrayDeque<>();

    static int graphColoring(int v) {
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G[q]) {
                if (visited[nex] == 1)
                    continue;
                visited[nex] = 1;
                color += 1;
                if (color == node2color[q])
                    color += 1;
                node2color[nex] = color;
                E.put(Math.min(q, nex) * N + Math.max(q, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        G = new ArrayList[N];
        E = new HashMap<>();
        for (int i = 0; i < N; i++)
            G[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E.put(Math.min(a, b) * N + Math.max(a, b), 0);
        }
        visited = new int[N];
        node2color = new int[N];
        System.out.println(graphColoring(0));
        for (int value : E.values())
            System.out.println(value);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of nodes and the edges from the input, creates the adjacency list representation of the graph, and then performs a breadth-first search (BFS) to color the graph. The colors are stored in a hash map, and the maximum number of colors used is printed at the end.

