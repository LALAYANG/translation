```java
import java.util.*;
import java.util.concurrent.*;

public class Main {

    private static int sumNodes(int x, int nodes) {
        return nodes + x;
    }

    private static List<Integer> readInts() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list;
    }

    private static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> visited, int i) throws InterruptedException, ExecutionException {
        if (visited.contains(i)) {
            return new int[]{0, 0};
        }
        visited.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            Future<int[]> future = Executors.newSingleThreadExecutor().submit(() -> dfs(g, visited, j));
            int[] result = future.get();
            nodes = sumNodes(result[0], nodes);
            edges += result[1];
        }
        return new int[]{nodes, edges};
    }

    private static boolean solve() {
        List<Integer> line0 = readInts();
        if (line0.isEmpty()) {
            return false;
        }
        int n = line0.get(0);
        int m = line0.get(1);
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            List<Integer> edge = readInts();
            int a = edge.get(0);
            int b = edge.get(1);
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                try {
                    int[] result = dfs(g, visited, i);
                    int nodes = result[0];
                    int edges = result[1];
                    if (nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges)) {
                        ans++;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
        return true;
    }

    public static void main(String[] args) {
        while (solve()) {
        }
    }
}
```

Please note that Java does not support multithreading in the same way as Python. The above code uses Java's ExecutorService to simulate multithreading, but it's not exactly the same as Python's threading module. Also, Java's Scanner class doesn't have a built-in way to read integers from the console, so I used a workaround to read all input into a list of integers.

