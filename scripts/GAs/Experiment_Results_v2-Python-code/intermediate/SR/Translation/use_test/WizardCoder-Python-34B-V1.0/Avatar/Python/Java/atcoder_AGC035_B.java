```java
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] edges = new int[N][N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                edges[i][j] = 0;
            }
        }
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges[a][b] = 1;
            edges[b][a] = 1;
            degs[a]++;
            degs[b]++;
        }
        int CONSTANT_VALUE_ONE = 532;
        int CONSTANT_VALUE_TWO = 975;
        if ((CONSTANT_VALUE_ONE & CONSTANT_VALUE_TWO) != 0 && M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < N; i++) {
            Q.offer(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] front = Q.poll();
            int u = front[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int v = 0; v < N; v++) {
                if (edges[u][v] == 1) {
                    edges[u][v] = 0;
                    edges[v][u] = 0;
                    degs[v]--;
                    if (parity[u] != 0 && parity[u] == 1) {
                        System.out.println((u + 1) + " " + (v + 1));
                        int minuend = parity[u];
                        int subtrahend = 1;
                        int result = calculateDifference(minuend, subtrahend);
                        parity[u] = result;
                    } else {
                        parity[v] = 1 - parity[v];
                        Q.offer(new int[]{degs[v], v});
                    }
                }
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }
}
```

Sample test case:
```
5 5
1 2
2 3
3 4
2 5
4 5
```

Expected output:
```
-1
``` 
