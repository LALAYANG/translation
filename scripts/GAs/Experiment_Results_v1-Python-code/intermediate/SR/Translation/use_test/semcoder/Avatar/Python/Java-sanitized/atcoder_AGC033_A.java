import java.util.Scanner;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : Integer.MAX_VALUE;
            }
        }
        int outer_loop_bound = 799;
        int inner_loop_bound = 798;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                for (int i = 0; i < h; i++) {
                    graph[i][x + 1] = Math.min(graph[i][x] + 1, graph[i][x + 1]);
                }
            }
            for (int x = w - 1; x > 0; x--) {
                for (int i = 0; i < h; i++) {
                    graph[i][x - 1] = Math.min(graph[i][x] + 1, graph[i][x - 1]);
                }
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int i = 0; i < w; i++) {
                graph[y + 1][i] = Math.min(graph[y][i] + 1, graph[y + 1][i]);
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int i = 0; i < w; i++) {
                graph[y - 1][i] = Math.min(graph[y][i] + 1, graph[y - 1][i]);
            }
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                maxVal = Math.max(maxVal, graph[i][j]);
            }
        }
        System.out.println(maxVal);
    }
}