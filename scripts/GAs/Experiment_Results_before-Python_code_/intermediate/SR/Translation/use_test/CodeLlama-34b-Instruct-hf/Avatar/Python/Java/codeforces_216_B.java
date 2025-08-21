```java
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!graph.containsKey(i)) {
                continue;
            }
            Set<Integer> seen = new HashSet<>();
            int nodes = 1;
            int edges = graph.get(i).size();
            for (int j : graph.get(i)) {
                if (seen.contains(j)) {
                    continue;
                }
                seen.add(j);
                nodes++;
                edges += graph.get(j).size();
            }
            if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                ans++;
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It uses a similar approach to the Python code, but with some differences in syntax and data structures. The code is written in a way that is easy to understand and modify, but it may not be the most efficient or concise way to solve the problem.
