import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        while (solve(scanner, executor)) {
        }
    }

    public static boolean solve(Scanner scanner, ExecutorService executor) {
        try {
            String[] line0 = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line0[0]);
            int m = Integer.parseInt(line0[1]);
            HashMap<Integer, HashSet<Integer>> g = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                g.put(i, new HashSet<>());
            }
            for (int i = 0; i < m; i++) {
                String[] edge = scanner.nextLine().split(" ");
                int a = Integer.parseInt(edge[0]);
                int b = Integer.parseInt(edge[1]);
                g.get(a).add(b);
                g.get(b).add(a);
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!dfs(g, new HashSet<>(), i, executor).getNodes() % 2 == 1 && 2 * dfs(g, new HashSet<>(), i, executor).getNodes() == dfs(g, new HashSet<>(), i, executor).getEdges()) {
                    ans++;
                }
            }
            if ((n - ans) % 2 == 1) {
                ans++;
            }
            System.out.println(ans);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static class DfsResult {
        int nodes;
        int edges;

        public DfsResult(int nodes, int edges) {
            this.nodes = nodes;
            this.edges = edges;
        }

        public int getNodes() {
            return nodes;
        }

        public int getEdges() {
            return edges;
        }
    }

    public static DfsResult dfs(HashMap<Integer, HashSet<Integer>> g, HashSet<Integer> visited, int i, ExecutorService executor) {
        if (visited.contains(i)) {
            return new DfsResult(0, 0);
        }
        visited.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            Future<DfsResult> future = executor.submit(() -> dfs(g, visited, j, executor));
            try {
                DfsResult result = future.get();
                nodes += result.getNodes();
                edges += result.getEdges();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new DfsResult(nodes, edges);
    }
}