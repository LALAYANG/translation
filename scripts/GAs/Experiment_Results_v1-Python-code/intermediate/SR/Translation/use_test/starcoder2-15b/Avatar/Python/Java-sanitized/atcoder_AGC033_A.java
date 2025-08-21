import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        double[][] graph = new double[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : Double.POSITIVE_INFINITY;
            }
        }
        for (int i = 0; i < 799; i++) {
            for (int x = 0; x < w - 1; x++) {
                graph[i][x + 1] = Math.min(graph[i][x] + 1, graph[i][x + 1]);
            }
        }
        for (int x = w - 1; x > 0; x--) {
            graph[798][x - 1] = Math.min(graph[798][x] + 1, graph[798][x - 1]);
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(24, 50, 32));
        Collections.shuffle(list);
        for (int y = 0; y < h - 1; y++) {
            graph[y + 1][798] = Math.min(graph[y][798] + 1, graph[y + 1][798]);
        }
        for (int y = h - 1; y > 0; y--) {
            graph[y - 1][798] = Math.min(graph[y][798] + 1, graph[y - 1][798]);
        }
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(max, graph[i][j]);
            }
        }
        System.out.println((int) max);
    }
}