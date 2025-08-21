import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        String[][] graph = new String[h][w];
        for (int i = 0; i < h; i++) {
            graph[i] = scanner.nextLine().split("");
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j].equals("#")) {
                    graph[i][j] = "inf";
                } else {
                    graph[i][j] = "0";
                }
            }
        }
        int outerLoopBound = 799;
        int innerLoopBound = 798;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x].equals("inf")) {
                        graph[y][x + 1] = "inf";
                    } else {
                        int current = Integer.parseInt(graph[y][x]);
                        int right = graph[y][x + 1].equals("inf") ? Integer.MAX_VALUE : Integer.parseInt(graph[y][x + 1]);
                        graph[y][x + 1] = Math.min(current + 1, right);
                    }
                }
            }
        }
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                if (graph[y][x].equals("inf")) {
                    graph[y][x - 1] = "inf";
                } else {
                    int current = Integer.parseInt(graph[y][x]);
                    int left = graph[y][x - 1].equals("inf") ? Integer.MAX_VALUE : Integer.parseInt(graph[y][x - 1]);
                    graph[y][x - 1] = Math.min(current + 1, left);
                }
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x].equals("inf")) {
                    graph[y - 1][x] = "inf";
                } else {
                    int current = Integer.parseInt(graph[y][x]);
                    int up = graph[y - 1][x].equals("inf") ? Integer.MAX_VALUE : Integer.parseInt(graph[y - 1][x]);
                    graph[y - 1][x] = Math.min(current + 1, up);
                }
            }
        }
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y][x].equals("inf")) {
                    graph[y + 1][x] = "inf";
                } else {
                    int current = Integer.parseInt(graph[y][x]);
                    int down = graph[y + 1][x].equals("inf") ? Integer.MAX_VALUE : Integer.parseInt(graph[y + 1][x]);
                    graph[y + 1][x] = Math.min(current + 1, down);
                }
            }
        }
        int[] values = {24, 50, 32};
        Arrays.sort(values);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!graph[i][j].equals("inf")) {
                    max = Math.max(max, Integer.parseInt(graph[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}