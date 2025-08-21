import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (solve(sc)) {
        }
    }

    public static boolean solve(Scanner sc) {
        try {
            String[] line0 = sc.nextLine().split(" ");
            if (line0 == null) {
                return false;
            }
            int n = Integer.parseInt(line0[0]);
            int m = Integer.parseInt(line0[1]);
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
            Set<Integer> seen = new HashSet<>();
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!seen.contains(i)) {
                    Pair<Integer, Integer> result = dfs(g, seen, i);
                    int nodes = result.getKey();
                    int edges = result.getValue();
                    if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                        ans++;
                    }
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

    public static Pair<Integer, Integer> dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new Pair<>(0, 0);
        }
        seen.add(i);
        int nodes = 1;
        int edges = g.get(i).size();
        for (int j : g.get(i)) {
            Pair<Integer, Integer> result = dfs(g, seen, j);
            nodes += result.getKey();
            edges += result.getValue();
        }
        return new Pair<>(nodes, edges);
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}