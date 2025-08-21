import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (solve(scanner)) {
        }
    }

    public static boolean solve(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            graph[edges[i][0]][edges[i][1]] = 1;
            graph[edges[i][1]][edges[i][0]] = 1;
        }
        int ans = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                int[] result = dfs(graph, visited, i);
                if (result[0] > 1 && result[0] % 2 == 1 && (2 * result[0] == result[1])) {
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

    public static int[] dfs(int[][] graph, Set<Integer> visited, int i) {
        if (visited.contains(i)) {
            return new int[]{0, 0};
        }
        visited.add(i);
        int nodes = 1;
        int edges = graph[i].length;
        for (int j = 1; j < graph[i].length; j++) {
            if (graph[i][j] == 1) {
                int[] result = dfs(graph, visited, j);
                nodes += result[0];
                edges += result[1];
            }
        }
        return new int[]{nodes, edges};
    }
}