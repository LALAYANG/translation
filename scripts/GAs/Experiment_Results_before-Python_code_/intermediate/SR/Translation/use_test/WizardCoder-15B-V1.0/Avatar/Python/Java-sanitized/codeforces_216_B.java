import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = sc.nextInt();
                int m = sc.nextInt();
                if (n == 0 && m == 0) {
                    break;
                }
                Map<Integer, Set<Integer>> g = new HashMap<>();
                for (int i = 1; i <= n; i++) {
                    g.put(i, new HashSet<>());
                }
                for (int i = 0; i < m; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    g.get(a).add(b);
                    g.get(b).add(a);
                }
                int ans = 0;
                for (int i = 1; i <= n; i++) {
                    Set<Integer> seen = new HashSet<>();
                    if (dfs(g, seen, i, 0, 0)) {
                        ans++;
                    }
                }
                if ((n - ans) % 2 == 1) {
                    ans++;
                }
                System.out.println(ans);
            } catch (Exception e) {
                break;
            }
        }
    }

    public static boolean dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i, int nodes, int edges) {
        if (seen.contains(i)) {
            return false;
        }
        seen.add(i);
        nodes++;
        edges += g.get(i).size();
        for (int j : g.get(i)) {
            if (dfs(g, seen, j, nodes, edges)) {
                return true;
            }
        }
        if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
            return true;
        }
        return false;
    }
}