```
import java.util.Scanner;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[][] edges = new int[m][2];
            for (int i = 0; i < m; i++) {
                edges[i][0] = scanner.nextInt();
                edges[i][1] = scanner.nextInt();
            }
            int ans = 0;
            HashSet<Integer> seen = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                if (!seen.contains(i)) {
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    seen.add(i);
                    int nodes = 1;
                    int edges = 0;
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        for (int j = 0; j < m; j++) {
                            if (edges[j][0] == node && !seen.contains(edges[j][1])) {
                                queue.add(edges[j][1]);
                                seen.add(edges[j][1]);
                                nodes++;
                                edges++;
                            }
                            if (edges[j][1] == node && !seen.contains(edges[j][0])) {
                                queue.add(edges[j][0]);
                                seen.add(edges[j][0]);
                                nodes++;
                                edges++;
                            }
                        }
                    }
                    if (nodes % 2 == 1 && nodes * 2 == edges) {
                        ans++;
                    }
                }
            }
            if (n % 2 == 1 && n - ans % 2 == 1) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}
```

