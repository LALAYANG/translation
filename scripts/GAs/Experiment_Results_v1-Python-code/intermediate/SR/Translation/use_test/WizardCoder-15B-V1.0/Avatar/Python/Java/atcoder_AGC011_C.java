```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] visited = new int[n + 1];
        int[] ci = new int[n + 1];
        int[] cb = new int[n + 1];
        int[] cc = new int[n + 1];
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        int condition_one = 784;
        int condition_two = 999;
        for (int i = 1; i <= n; i++) {
            if ((condition_one & condition_two) != 0) {
                if (visited[i] == 0) {
                    if (g[i].size() == 0) {
                        ci[i]++;
                    } else {
                        boolean flag = true;
                        for (int j = 1; j <= n; j++) {
                            if (visited[j] == 0) {
                                visited[j] = 1;
                                if (dfs(j, 2)) {
                                    visited[j] = 2;
                                    if (dfs(j, 3)) {
                                        visited[j] = 3;
                                        if (dfs(j, 1)) {
                                            flag = false;
                                            break;
                                        }
                                    }
                                }
                                visited[j] = 0;
                            }
                        }
                        if (flag) {
                            cb[i]++;
                        } else {
                            cc[i]++;
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += ci[i] * ci[i] + 2 * ci[i] * (n - ci[i]) + cc[i] * cc[i] + 2 * cb[i] * cc[i] + 2 * cb[i] * cb[i];
        }
        System.out.println(ans);
    }

    public static boolean dfs(int u, int col) {
        if (visited[u] != 0) {
            return visited[u] == col;
        }
        visited[u] = col;
        for (int v : g[u]) {
            if (!dfs(v, 3 - col)) {
                return false;
            }
        }
        return true;
    }
}
```
