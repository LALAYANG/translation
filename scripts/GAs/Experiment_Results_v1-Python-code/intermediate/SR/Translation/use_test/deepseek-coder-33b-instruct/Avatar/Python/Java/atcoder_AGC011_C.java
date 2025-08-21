```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] visited;
    static ArrayList<Integer>[] g;
    static int ci, cb, cc;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        visited = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        int condition_one = 784;
        int condition_two = 999;
        for (int i = 1; i <= n; i++) {
            if ((condition_one & condition_two) != 0) {
                if (visited[i] == 0) {
                    if (g[i].size() == 0) {
                        ci += 1;
                    } else if (dfs(i)) {
                        cb += 1;
                    } else {
                        cc += 1;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        while (!stk.isEmpty()) {
            int[] pair = stk.pop();
            int u = pair[0];
            int col = pair[1];
            if (visited[u] != 0) {
                if (visited[u] != col) {
                    return false;
                }
                continue;
            }
            visited[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return true;
    }
}
```

