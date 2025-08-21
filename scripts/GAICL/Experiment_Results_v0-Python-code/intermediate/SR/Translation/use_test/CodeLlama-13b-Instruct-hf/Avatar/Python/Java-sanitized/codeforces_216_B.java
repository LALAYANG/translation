import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class codeforces_216_B {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        List<List<Integer>> g = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = readInt();
            int b = readInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!seen.contains(i)) {
                int[] result = dfs(g, seen, i);
                if (result[0] > 1 && result[0] % 2 == 1 && result[1] == 2 * result[0]) {
                    ans++;
                }
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }

    private static int[] dfs(List<List<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[] {0, 0};
        }

        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            if (!seen.contains(j)) {
                int[] result = dfs(g, seen, j);
                nodes += result[0];
                edges += result[1];
            }
        }

        return new int[] {nodes, edges};
    }

    private static int readInt() {
        return Integer.parseInt(System.console().readLine());
    }
}