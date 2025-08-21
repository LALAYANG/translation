import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int nodes = 1;
                int edges = graph.get(i).size();
                for (int j : graph.get(i)) {
                    if (!seen.contains(j)) {
                        nodes += dfs(graph, seen, j);
                        edges += graph.get(j).size();
                    }
                }
                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans += 1;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans += 1;
        }
        System.out.println(ans);
    }

    private static int dfs(Map<Integer, Set<Integer>> graph, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return 0;
        }
        seen.add(i);
        int nodes = 1;
        int edges = graph.get(i).size();
        for (int j : graph.get(i)) {
            if (!seen.contains(j)) {
                nodes += dfs(graph, seen, j);
                edges += graph.get(j).size();
            }
        }
        return nodes + edges;
    }
}