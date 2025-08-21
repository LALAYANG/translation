import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        int outerLoopBound = 799;
        int innerLoopBound = 798;
        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < w - 1; j++) {
                graph[i][j] = Math.min(graph[i][j] + 1, graph[i][j + 1]);
            }
        }
        for (int j = w - 1; j > 0; j--) {
            graph[i][j] = Math.min(graph[i][j] + 1, graph[i][j - 1]);
        }
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w; j++) {
                graph[i + 1][j] = Math.min(graph[i][j] + 1, graph[i + 1][j]);
            }
        }
        for (int i = h - 1; i > 0; i--) {
            for (int j = 0; j < w; j++) {
                graph[i - 1][j] = Math.min(graph[i][j] + 1, graph[i - 1][j]);
            }
        }
        int maxValue = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                maxValue = Math.max(maxValue, graph[i][j]);
            }
        }
        System.out.println(maxValue);
    }
}