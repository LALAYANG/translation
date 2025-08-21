import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (solve(scanner)) {
        }
    }

    public static boolean solve(Scanner scanner) {
        int numNodes = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer>[] g = new Set[numNodes + 1];
        for (int i = 1; i <= numNodes; i++) {
            g[i] = new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g[a].add(b);
            g[b].add(a);
        }
        int ans = 0;
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= numNodes; i++) {
            if (!seen.contains(i)) {
                int[] result = dfs(g, seen, i);
                int nodes = result[0];
                int edges = result[1];
                if (nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges)) {
                    ans++;
                }
            }
        }
        if ((numNodes - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
        return true;
    }

    public static int[] dfs(Set<Integer>[] g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return new int[]{0, 0};
        }
        seen.add(i);
        int nodes = 1;
        int edges = g[i].size();
        for (int j : g[i]) {
            Queue<int[]> queue = new LinkedList<>();
            Thread thread = new Thread(() -> {
                queue.add(dfs(g, seen, j));
            });
            thread.start();
            thread.join();
            int[] result = queue.poll();
            nodes += result[0];
            edges += result[1];
        }
        return new int[]{nodes, edges};
    }
}