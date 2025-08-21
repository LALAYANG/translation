import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (solve(sc)) {
        }
    }

    public static boolean solve(Scanner sc) {
        int num_nodes, m;
        try {
            num_nodes = sc.nextInt();
            m = sc.nextInt();
        } catch (NoSuchElementException e) {
            return false;
        }

        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 1; i <= num_nodes; i++) {
            g.put(i, new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 1; i <= num_nodes; i++) {
            if (!seen.contains(i)) {
                int[] result = dfs(g, seen, i);
                int nodes = result[0];
                int edges = result[1];

                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }

        if ((num_nodes - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
        return true;
    }

    public static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[]{0, 0};
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();

        for (int j : g.get(i)) {
            int[] result = dfs(g, seen, j);
            nodes += result[0];
            edges += result[1];
        }

        return new int[]{nodes, edges};
    }
}