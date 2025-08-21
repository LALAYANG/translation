import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int start = scanner.nextInt() - 1;
        int[] visited = new int[n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = 1;
        int k = 0;
        Map<Integer, Integer> node2color = new HashMap<>();
        while (!queue.isEmpty()) {
            int q = queue.remove();
            int color = 0;
            for (int nex : graph[q]) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = 1;
                color++;
                if (color == node2color.getOrDefault(q, 0)) {
                    color++;
                }
                node2color.put(nex, color);
                queue.add(nex);
            }
            k = Math.max(k, color);
        }
        System.out.println(k);
        for (int i = 0; i < n; i++) {
            System.out.println(node2color.getOrDefault(i, 0));
        }
    }
}