```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] g = new int[n + 1][n + 1];
        int[][] visited = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                g[i][j] = 0;
                visited[i] = 0;
            }
        }
        for (int i = 1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g[a][b] = 1;
            g[b][a] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                int nodes = 1;
                int edges = 0;
                for (int j = 1; j <= n; j++) {
                    if (g[i][j] == 1) {
                        edges++;
                        if (visited[j] == 0) {
                            nodes++;
                            visited[j] = 1;
                        }
                    }
                }
                if (nodes % 2 == 1 && (2 * nodes == edges)) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```

Test input:
3 3
1 2
1 3
2 3

Expected output:
1 
