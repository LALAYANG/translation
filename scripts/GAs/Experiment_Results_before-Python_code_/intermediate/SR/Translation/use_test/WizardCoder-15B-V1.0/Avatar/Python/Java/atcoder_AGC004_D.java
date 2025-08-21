```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            aaa[i] = sc.nextInt() - 1;
        }
        int[][] links = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                links[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (aaa[i] == j) {
                    links[i][j] = 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] height_from_leaf = new int[n];
            Arrays.fill(height_from_leaf, -1);
            int[] cut_count = new int[n];
            Arrays.fill(cut_count, -1);
            int[] visited = new int[n];
            Arrays.fill(visited, -1);
            int[] parent = new int[n];
            Arrays.fill(parent, -1);
            int hgt = dfs(links, n, k, i, height_from_leaf, cut_count, visited, parent);
            if (hgt == k) {
                ans++;
            }
        }
        if (aaa[0] != 0) {
            ans++;
        }
        System.out.println(ans);
    }

    public static int dfs(int[][] links, int n, int k, int v, int[] height_from_leaf, int[] cut_count, int[] visited, int[] parent) {
        if (visited[v] == 1) {
            return height_from_leaf[v];
        }
        visited[v] = 1;
        int height = 0;
        for (int u = 0; u < n; u++) {
            if (links[v][u] == 1 && u != parent[v]) {
                parent[u] = v;
                int hgt = dfs(links, n, k, u, height_from_leaf, cut_count, visited, parent);
                height = Math.max(height, hgt);
                if (height_from_leaf[u] == k - 1) {
                    cut_count[v]++;
                }
            }
        }
        height++;
        if (parent[v] != -1 && height == k) {
            height = 0;
            cut_count[v]++;
        }
        height_from_leaf[v] = height;
        return height;
    }
}
```
