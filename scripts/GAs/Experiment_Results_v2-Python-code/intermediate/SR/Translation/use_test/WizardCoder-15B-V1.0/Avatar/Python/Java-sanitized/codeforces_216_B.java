import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dfs(graph, i, new HashSet<>())) {
                ans++;
            }
        }
        if (n % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean dfs(Map<Integer, Set<Integer>> graph, int i, Set<Integer> seen) {
        if (seen.contains(i)) {
            return false;
        }
        seen.add(i);
        int nodes = 1;
        int edges = graph.get(i).size();
        for (int j : graph.get(i)) {
            if (dfs(graph, j, seen)) {
                nodes++;
            }
        }
        return nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges);
    }
}