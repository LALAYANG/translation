Here is the Java version of the Python code. Note that Java does not have built-in support for multithreading, so the threading and queue libraries are not used. Also, Java does not have built-in support for the scipy.stats and numpy libraries, so those are not used.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
        }
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degs[a]++;
            degs[b]++;
        }
        if ((532 & 975) != 0) {
            if (M % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] pair = Q.poll();
            int u = pair[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int v : edges.get(u)) {
                edges.get(v).remove(u);
                if (parity[u] != 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = calculateDifference(parity[u], 1);
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(new int[]{degs[v], v});
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }
}
```

This Java code does not use the scipy.stats and numpy libraries, so the ttest_ind function is not used. The calculateDifference function is used instead.

