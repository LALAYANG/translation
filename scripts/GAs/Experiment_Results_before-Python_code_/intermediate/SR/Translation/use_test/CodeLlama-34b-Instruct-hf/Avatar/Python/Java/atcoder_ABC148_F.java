```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(g, ta, ta_dist);
        dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void dfs(List<List<Integer>> g, int node, int[] dist) {
        for (int v : g.get(node)) {
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist);
        }
    }
}
```
Note: The above code uses the `java.util.Scanner` class to read input from the user. If you want to use the `inp()` and `inpl()` functions from the original Python code, you can replace the `Scanner` class with the `BufferedReader` class and use the `readLine()` method to read input from the user.
