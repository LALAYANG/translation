```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int outer_loop_bound = 799;
        int inner_loop_bound = 798;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x] != 0) {
                        graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
                    }
                }
            }
            for (int x = w - 2; x >= 0; x--) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x] != 0) {
                        graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
                    }
                }
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x] != 0) {
                    graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
                }
            }
        }
        for (int y = h - 2; y >= 0; y--) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x] != 0) {
                    graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x] != 0) {
                    max = Math.max(max, graph[y][x]);
                }
            }
        }
        System.out.println(max);
    }
}
```
