```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                int[] result = dfs(g, visited, i);
                if (result[0] > 1 && result[0] % 2 == 1 && (2 * result[0] == result[1])) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> visited, int i) {
        if (visited.contains(i)) {
            return new int[]{0, 0};
        }
        visited.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] result = dfs(g, visited, j);
            nodes += result[0];
            edges += result[1];
        }
        return new int[]{nodes, edges};
    }
}
```
