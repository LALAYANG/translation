import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes, numEdges;
        numNodes = sc.nextInt();
        numEdges = sc.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= numNodes; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < numEdges; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= numNodes; i++) {
            if (dfs(graph, i, new HashSet<>())) {
                ans++;
            }
        }
        if (numNodes % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean dfs(Map<Integer, Set<Integer>> graph, int node, Set<Integer> seen) {
        if (seen.contains(node)) {
            return false;
        }
        seen.add(node);
        if (graph.get(node).size() % 2 == 1) {
            return true;
        }
        for (int neighbor : graph.get(node)) {
            if (dfs(graph, neighbor, seen)) {
                return true;
            }
        }
        return false;
    }
}