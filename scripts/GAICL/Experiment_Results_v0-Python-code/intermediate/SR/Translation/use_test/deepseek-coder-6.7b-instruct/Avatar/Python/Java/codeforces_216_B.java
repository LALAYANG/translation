Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

class Main {
    static Map<Integer, Set<Integer>> g = new HashMap<>();
    static Set<Integer> visited = new HashSet<>();

    static int sumNodes(int x, int nodes) {
        return nodes + x;
    }

    static int[] readInts() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int[] dfs(int i) {
        if (visited.contains(i)) {
            return new int[]{0, 0};
        }
        visited.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] result = dfs(j);
            nodes = sumNodes(result[0], nodes);
            edges += result[1];
        }
        return new int[]{nodes, edges};
    }

    static boolean solve() {
        int[] line0 = readInts();
        if (line0.length == 0) {
            return false;
        }
        int n = line0[0], m = line0[1];
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        visited.clear();
        for (int i = 0; i < m; i++) {
            int[] edge = readInts();
            g.get(edge[0]).add(edge[1]);
            g.get(edge[1]).add(edge[0]);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                int[] result = dfs(i);
                if (result[0] > 1 && result[0] % 2 == 1 && result[0] * 2 == result[1]) {
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
        while (solve()) {}
    }
}
```

This Java code does the same thing as the Python code. It reads integers from the standard input, builds a graph, and then performs a depth-first search on the graph. It counts the number of nodes and edges in each connected component, and prints the number of connected components that meet certain conditions. The conditions are similar to those in the Python code.

