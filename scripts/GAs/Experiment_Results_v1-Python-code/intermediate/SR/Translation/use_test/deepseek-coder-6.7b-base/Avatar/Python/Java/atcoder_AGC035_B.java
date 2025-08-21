```
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] degrees = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
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
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            queue.offer(new int[]{degrees[i], i});
        }
        while (!queue.isEmpty()) {
            int[] top = queue.poll();
            int u = top[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int i = 0; i < edges.get(u).size(); i++) {
                int v = edges.get(u).get(i);
                edges.get(v).remove(Integer.valueOf(u));
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    int subtrahend = parity[u];
                    int minuend = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateDifference(minuend, subtrahend));
                    int result = future.get();
                    parity[u] = result;
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degrees[v]--;
                queue.offer(new int[]{degrees[v], v});
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}
```

