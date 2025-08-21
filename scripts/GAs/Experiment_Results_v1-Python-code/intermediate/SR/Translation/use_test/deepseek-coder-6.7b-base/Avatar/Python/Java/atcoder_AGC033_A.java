```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        int outer_loop_bound = 799;
        int inner_loop_bound = 798;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x + 1] > graph[y][x] + 1) {
                        graph[y][x + 1] = graph[y][x] + 1;
                    }
                }
            }
            for (int x = w - 1; x > 0; x--) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x - 1] > graph[y][x] + 1) {
                        graph[y][x - 1] = graph[y][x] + 1;
                    }
                }
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y + 1][x] > graph[y][x] + 1) {
                    graph[y + 1][x] = graph[y][x] + 1;
                }
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                if (graph[y - 1][x] > graph[y][x] + 1) {
                    graph[y - 1][x] = graph[y][x] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
```

