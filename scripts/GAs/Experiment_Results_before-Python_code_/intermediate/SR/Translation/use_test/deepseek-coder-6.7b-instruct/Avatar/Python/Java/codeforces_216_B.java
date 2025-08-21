Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    static int[] readInts() {
        return Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[]{0, 0};
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] xy = dfs(g, seen, j);
            nodes += xy[0];
            edges += xy[1];
        }
        return new int[]{nodes, edges};
    }

    static boolean solve() {
        int[] line0 = readInts();
        if (line0.length == 0) {
            return false;
        }
        int n = line0[0], m = line0[1];
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int[] ab = readInts();
            g.get(ab[0]).add(ab[1]);
            g.get(ab[1]).add(ab[0]);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int[] xy = dfs(g, seen, i);
                if (xy[0] > 1 && xy[0] % 2 == 1 && 2 * xy[0] == xy[1]) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
        return true;
    }

    public static void main(String[] args) {
        while (solve()) {
        }
    }
}
```

This Java code does the same thing as the Python code. It reads integers from the input, performs a depth-first search (DFS) on a graph, and prints the number of connected components in the graph that meet certain conditions. The conditions are that the number of nodes in the component is odd and twice the number of nodes is equal to the number of edges in the component. If the number of nodes in the remaining components is odd, it adds one to the answer.

