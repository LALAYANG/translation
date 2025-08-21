import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        int outerLoopBound = 113;
        int innerLoopBound = 112;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int x = 0; x < w - 1; x++) {
                graph[x + 1][x] = Math.min(graph[x][x] + 1, graph[x + 1][x]);
            }
            for (int x = w - 1; x > 0; x--) {
                graph[x - 1][x] = Math.min(graph[x][x] + 1, graph[x - 1][x]);
            }
            for (int rowIndex = 0; rowIndex < h - 1; rowIndex++) {
                graph[rowIndex + 1][rowIndex] = Math.min(graph[rowIndex][rowIndex] + 1, graph[rowIndex + 1][rowIndex]);
            }
            for (int rowIndex = h - 1; rowIndex > 0; rowIndex--) {
                graph[rowIndex - 1][rowIndex] = Math.min(graph[rowIndex][rowIndex] + 1, graph[rowIndex - 1][rowIndex]);
            }
        }
        System.out.println(Arrays.stream(graph).max().getAsInt());
    }
}