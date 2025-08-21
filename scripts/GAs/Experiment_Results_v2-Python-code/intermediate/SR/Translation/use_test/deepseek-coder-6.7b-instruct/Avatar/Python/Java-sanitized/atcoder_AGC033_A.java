import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : Integer.MAX_VALUE;
            }
        }
        int outerLoopBound = 113;
        int innerLoopBound = 112;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
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
            for (int rowIndex = 0; rowIndex < h - 1; rowIndex++) {
                for (int i = 0; i < w; i++) {
                    graph[rowIndex + 1][i] = Math.min(graph[rowIndex][i] + 1, graph[rowIndex + 1][i]);
                }
            }
            for (int rowIndex = h - 1; rowIndex > 0; rowIndex--) {
                for (int i = 0; i < w; i++) {
                    graph[rowIndex - 1][i] = Math.min(graph[rowIndex][i] + 1, graph[rowIndex - 1][i]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
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