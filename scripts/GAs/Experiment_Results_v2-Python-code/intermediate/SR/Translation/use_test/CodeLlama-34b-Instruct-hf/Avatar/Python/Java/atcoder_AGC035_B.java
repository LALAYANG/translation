```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class CalculateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] edges = new int[N][N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[a - 1][b - 1] = 1;
            edges[b - 1][a - 1] = 1;
            degs[a - 1]++;
            degs[b - 1]++;
        }

        if (N % 2 != 0) {
            System.out.println(-1);
            return;
        }

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Q.add(degs[i]);
        }

        while (!Q.isEmpty()) {
            int u = Q.poll();
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int v : edges[u]) {
                if (parity[u] != 0 && v == 0) {
                    System.out.println(u + 1 + " " + v + 1);
                    int minuend = parity[u];
                    int subtrahend = 1;
                    ThreadPoolExecutor executor = new ThreadPoolExecutor(1);
                    executor.execute(() -> {
                        int result = calculateDifference(minuend, subtrahend);
                        parity[u] = result;
                    });
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(degs[v]);
            }
        }
    }

    private static int calculateDifference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }
}
```
Note: The above code uses the `ThreadPoolExecutor` class to create a thread pool with a single thread, and then uses the `execute()` method to execute the `calculateDifference()` method in a separate thread. This allows the main thread to continue executing while the `calculateDifference()` method is running in the background.
