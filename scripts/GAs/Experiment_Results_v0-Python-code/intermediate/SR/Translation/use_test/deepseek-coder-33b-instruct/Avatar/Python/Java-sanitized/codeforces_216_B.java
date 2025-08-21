import java.util.*;
import java.util.concurrent.*;

public class codeforces_216_B {
    static int sumNodes(int x, int nodes) {
        return nodes + x;
    }

    static int[] readInts() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] ints = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            ints[i] = Integer.parseInt(line[i]);
        }
        return ints;
    }

    static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> visited, int i) throws ExecutionException, InterruptedException {
        if (visited.contains(i)) {
            return new int[]{0, 0};
        }
        visited.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int j : g.get(i)) {
            Future<int[]> future = executor.submit(() -> dfs(g, visited, j));
            int[] result = future.get();
            nodes = sumNodes(result[0], nodes);
            edges += result[1];
        }
        executor.shutdown();
        return new int[]{nodes, edges};
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] line0 = readInts();
        int n = line0[0];
        int m = line0[1];
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int[] ab = readInts();
            int a = ab[0];
            int b = ab[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                int[] result = dfs(g, visited, i);
                if (result[0] > 1 && result[0] % 2 == 1 && (2 * result[0] == result[1])) {
                    ans += 1;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans += 1;
        }
        System.out.println(ans);
    }
}