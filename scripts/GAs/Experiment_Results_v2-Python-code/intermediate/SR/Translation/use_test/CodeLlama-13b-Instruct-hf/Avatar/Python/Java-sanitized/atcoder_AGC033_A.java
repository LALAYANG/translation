import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
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
        int outerLoopBound = 113;
        int innerLoopBound = 112;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int x = 0; x < w - 1; x++) {
                graph[x + 1] = Math.min(graph[x] + 1, graph[x + 1]);
            }
            for (int x = w - 1; x > 0; x--) {
                graph[x - 1] = Math.min(graph[x] + 1, graph[x - 1]);
            }
            for (int rowIndex = 0; rowIndex < h - 1; rowIndex++) {
                graph[rowIndex + 1] = Math.min(graph[rowIndex] + 1, graph[rowIndex + 1]);
            }
            for (int rowIndex = h - 1; rowIndex > 0; rowIndex--) {
                graph[rowIndex - 1] = Math.min(graph[rowIndex] + 1, graph[rowIndex - 1]);
            }
        }
        int[] shuffled = new int[3];
        for (int i = 0; i < 3; i++) {
            shuffled[i] = scanner.nextInt();
        }
        Collections.shuffle(Arrays.asList(shuffled));
        System.out.println(Arrays.toString(shuffled));
    }
}