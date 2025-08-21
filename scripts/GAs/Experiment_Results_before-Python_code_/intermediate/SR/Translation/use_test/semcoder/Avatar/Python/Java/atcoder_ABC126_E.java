Thought process:
1. Read the input values for `N` and `M`.
2. Initialize an adjacency list `edge` to represent the graph connections.
3. Parse the input edges and populate the adjacency list.
4. Initialize a boolean list `used` to track visited nodes.
5. Initialize a variable `ans` to count the number of connected components.
6. Iterate over each node, perform a breadth-first search (BFS) starting from unvisited nodes, and increment `ans` for each connected component found.
7. Print the final count of connected components.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }

        boolean[] used = new boolean[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                used[i] = true;

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int nextnode : edge.get(node)) {
                        if (!used[nextnode]) {
                            queue.add(nextnode);
                            used[nextnode] = true;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```
