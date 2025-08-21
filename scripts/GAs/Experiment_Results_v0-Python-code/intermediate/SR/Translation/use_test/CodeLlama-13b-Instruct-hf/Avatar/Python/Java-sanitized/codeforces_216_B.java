import java.util.Map;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_216_B {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Map<Integer, Set<Integer>> g = new ConcurrentHashMap<>();
        Set<Integer> visited = ConcurrentHashMap.newKeySet();

        for (int i = 1; i <= n; i++) {
            g.put(i, new ConcurrentLinkedQueue<>());
        }

        for (int i = 0; i < m; i++) {
            int a = readInt();
            int b = readInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                int nodes = 1;
                int edges = g.get(i).size();
                for (int j : g.get(i)) {
                    if (!visited.contains(j)) {
                        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
                        queue.add(j);
                        int x = queue.poll();
                        int y = g.get(x).size();
                        nodes += y;
                        edges += y;
                    }
                }
                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }

    private static int readInt() {
        return Integer.parseInt(System.console().readLine());
    }
}