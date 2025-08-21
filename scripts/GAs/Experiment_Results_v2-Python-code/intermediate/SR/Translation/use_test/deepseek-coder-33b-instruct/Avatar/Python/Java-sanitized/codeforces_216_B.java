import java.util.*;

public class codeforces_216_B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (solve()) {
        }
    }

    static int[] readInts() {
        String[] line = sc.nextLine().split(" ");
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        return arr;
    }

    static int[] dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[]{0, 0};
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            int[] dfsResult = dfs(g, seen, j);
            nodes += dfsResult[0];
            edges += dfsResult[1];
        }
        return new int[]{nodes, edges};
    }

    static boolean solve() {
        int[] line0 = readInts();
        if (line0.length == 0) {
            return false;
        }
        int n = line0[0];
        int m = line0[1];
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

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
            if (!seen.contains(i)) {
                int[] dfsResult = dfs(g, seen, i);
                int nodes = dfsResult[0];
                int edges = dfsResult[1];
                if (nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges)) {
                    ans += 1;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans += 1;
        }
        System.out.println(ans);
        return true;
    }
}