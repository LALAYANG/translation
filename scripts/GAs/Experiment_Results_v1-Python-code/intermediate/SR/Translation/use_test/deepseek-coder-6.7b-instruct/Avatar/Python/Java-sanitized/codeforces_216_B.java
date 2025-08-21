import java.util.*;
import java.util.concurrent.*;

public class codeforces_216_B {
    private static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static int[] readInts() {
        String[] parts = new Scanner(System.in).nextLine().split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++)
            numbers[i] = Integer.parseInt(parts[i]);
        return numbers;
    }

    private static Pair dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i))
            return new Pair(0, 0);
        seen.add(i);
        int nodes = 1, edges = g.get(i).size();
        for (int j : g.get(i)) {
            try {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Pair> future = executor.submit(() -> dfs(g, seen, j));
                Pair result = future.get();
                executor.shutdown();
                nodes += result.first;
                edges += result.second;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new Pair(nodes, edges);
    }

    private static boolean solve() {
        int[] line0 = readInts();
        if (line0.length == 0)
            return false;
        int num_nodes = line0[0], m = line0[1];
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= num_nodes; i++)
            g.put(i, new HashSet<>());
        for (int i = 0; i < m; i++) {
            int[] edge = readInts();
            int a = edge[0], b = edge[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= num_nodes; i++) {
            if (!seen.contains(i)) {
                Pair result = dfs(g, seen, i);
                if (result.first > 1 && result.first % 2 == 1 && result.first * 2 == result.second)
                    ans++;
            }
        }
        if ((num_nodes - ans) % 2 == 1)
            ans++;
        System.out.println(ans);
        return true;
    }

    public static void main(String[] args) {
        while (solve()) {}
    }
}