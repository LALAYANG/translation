```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
        }
        int[] degrees = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degrees[a]++;
            degrees[b]++;
        }
        if ((341 & 616) != 0) {
            if (M % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] pair = Q.poll();
            int u = pair[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges.get(u)) {
                edges.get(v).remove(u);
                if (parity[u] != 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    int subtrahend = parity[u];
                    int minuend = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> calculateDifference(minuend, subtrahend));
                    parity[u] = future.get();
                    executor.shutdown();
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degrees[v]--;
                Q.add(new int[]{degrees[v], v});
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}
```

