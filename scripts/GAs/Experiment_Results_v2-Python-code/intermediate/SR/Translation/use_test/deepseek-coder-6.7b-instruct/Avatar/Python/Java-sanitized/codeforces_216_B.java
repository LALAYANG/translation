import java.util.*;

public class codeforces_216_B {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Integer> seen = new HashSet<>();
    private static Map<Integer, Set<Integer>> g = new HashMap<>();

    private static int[] readInts() {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int dfs(int i) {
        if (seen.contains(i)) {
            return 0;
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            nodes += dfs(j);
            edges += g.get(j).size();
        }
        return nodes;
    }

    private static boolean solve() {
        int[] line0 = readInts();
        if (line0.length == 0) {
            return false;
        }
        int n = line0[0], m = line0[1];
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int[] ab = readInts();
            g.get(ab[0]).add(ab[1]);
            g.get(ab[1]).add(ab[0]);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int nodes = dfs(i);
                if (nodes > 1 && nodes % 2 == 1 && nodes * 2 == g.get(i).size() * 2) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
        return true;
    }

    public static void main(String[] args) {
        while (solve()) {}
    }
}