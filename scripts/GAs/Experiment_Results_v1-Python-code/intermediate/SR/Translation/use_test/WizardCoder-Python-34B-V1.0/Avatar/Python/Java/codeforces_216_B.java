```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_nodes = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] g = new int[num_nodes + 1][num_nodes + 1];
        for (int i = 1; i <= num_nodes; i++) {
            for (int j = 1; j <= num_nodes; j++) {
                g[i][j] = 0;
            }
        }
        for (int i = 1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g[a][b] = 1;
            g[b][a] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= num_nodes; i++) {
            if (isOdd(i, g, new HashSet<Integer>())) {
                ans++;
            }
        }
        if ((num_nodes - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean isOdd(int i, int[][] g, HashSet<Integer> seen) {
        if (seen.contains(i)) {
            return false;
        }
        seen.add(i);
        int nodes = 1;
        int edges = 0;
        for (int j = 1; j <= num_nodes; j++) {
            if (g[i][j] == 1) {
                nodes++;
                edges++;
                if (isOdd(j, g, seen)) {
                    edges++;
                }
            }
        }
        return nodes % 2 == 1 && (2 * nodes == edges);
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
