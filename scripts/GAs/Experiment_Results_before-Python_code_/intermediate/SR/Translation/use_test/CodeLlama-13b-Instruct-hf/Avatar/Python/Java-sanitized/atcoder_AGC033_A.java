import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC033_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] graph = new int[h][w];

        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }

        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }

        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
            }
        }

        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (int[] row : graph) {
            for (int value : row) {
                maxValue = Math.max(maxValue, value);
            }
        }

        System.out.println(maxValue);
    }
}