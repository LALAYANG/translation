Thought process:
1. Read the input values for `n`, `ta`, and `ao`.
2. Build the graph `g` by connecting the nodes with edges.
3. Initialize distance lists `ta_dist` and `ao_dist`.
4. Perform depth-first search (DFS) from the target and attacker's positions to calculate distances.
5. Find the maximum distance where the target can reach the attacker without being caught.
6. Print the result.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;

        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }

        int[] taDist = new int[n];
        Arrays.fill(taDist, -1);
        taDist[ta] = 0;

        int[] aoDist = new int[n];
        Arrays.fill(aoDist, -1);
        aoDist[ao] = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(ao);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph[node]) {
                if (aoDist[neighbor] != -1) continue;
                aoDist[neighbor] = aoDist[node] + 1;
                queue.offer(neighbor);
            }
        }

        queue.offer(ta);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph[node]) {
                if (taDist[neighbor] != -1) continue;
                taDist[neighbor] = taDist[node] + 1;
                queue.offer(neighbor);
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] > aoDist[i]) continue;
            res = Math.max(res, aoDist[i]);
        }

        System.out.println(res - 1);
    }
}
```
