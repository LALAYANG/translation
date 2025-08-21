```java
import java.util.*;

public class Main {
    static ArrayList<Integer>[] edge;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }

        used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    used[node] = true;
                    for (int nextNode : edge[node]) {
                        if (!used[nextNode]) {
                            queue.add(nextNode);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of nodes and edges, then reads the edges and adds them to the adjacency list. It then uses a BFS to find the number of connected components in the graph.

