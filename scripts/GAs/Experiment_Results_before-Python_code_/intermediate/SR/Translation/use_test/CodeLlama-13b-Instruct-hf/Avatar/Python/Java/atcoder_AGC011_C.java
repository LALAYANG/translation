
The provided Python code is a solution to the "Coloring Graph" problem, which is a classic problem in graph theory. The code takes in a graph represented as an adjacency list, and it outputs the number of connected components in the graph.

Here is the Java code that implements the same logic:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ColoringGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g.get(i).size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, g, vis)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    private static boolean dfs(int u, List<List<Integer>> g, int[] vis) {
        boolean flag = true;
        for (int v : g.get(u)) {
            if (vis[v] == 0) {
                vis[v] = 1;
                flag &= dfs(v, g, vis);
            } else {
                flag &= (vis[v] == 1);
            }
        }
        return flag;
    }
}
```
The code uses a similar approach as the Python code, with a few differences in syntax and data structures. The `dfs` method is implemented using a recursive approach, and it returns `true` if the graph is connected, and `false` otherwise. The `main` method reads the input from the user, creates the graph, and calls the `dfs` method to determine the number of connected components in the graph. Finally, it prints the result to the console.

Note that the `dfs` method uses a `vis` array to keep track of the visited nodes, and it returns `true` if all the nodes in the graph are connected, and `false` otherwise. The `main` method uses a similar approach to keep track of the number of connected components in the graph.
