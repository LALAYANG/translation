import java.util.*;
import java.util.concurrent.*;

public class codeforces_216_B {
    static class Pair {
        int nodes;
        int edges;

        Pair(int nodes, int edges) {
            this.nodes = nodes;
            this.edges = edges;
        }
    }

    static int num_nodes, m;
    static Map<Integer, Set<Integer>> g = new HashMap<>();
    static Set<Integer> seen = new HashSet<>();

    static Pair dfs(int i) {
        if (seen.contains(i))
            return new Pair(0, 0);
        seen.add(i);
        int nodes = 1, edges = g.get(i).size();
        for (int j : g.get(i)) {
            Pair result = dfs(j);
            nodes += result.nodes;
            edges += result.edges;
        }
        return new Pair(nodes, edges);
    }

    static void initializeGraph(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop))
            return;
        g.put(i, new HashSet<>());
        initializeGraph(i + step, stop, step);
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        num_nodes = sc.nextInt();
        m = sc.nextInt();
        initializeGraph(1, num_nodes + 1, 1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= num_nodes; i++) {
            if (!seen.contains(i)) {
                Pair result = dfs(i);
                if (result.nodes > 1 && result.nodes % 2 == 1 && (2 * result.nodes == result.edges))
                    ans++;
            }
        }
        if ((num_nodes - ans) % 2 == 1)
            ans++;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        solve();
    }
}