import java.util.*;
import java.net.*;
import java.io.*;
import java.time.*;
import java.text.*;
import javax.crypto.*;
import org.apache.commons.math3.stat.inference.*;
import org.apache.commons.codec.binary.*;

public class atcoder_AGC033_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.nextLine();
        double[][] graph = new double[height][width];
        for (int i = 0; i < height; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < width; j++) {
                graph[i][j] = (line.charAt(j) == '#') ? 0 : Double.POSITIVE_INFINITY;
            }
        }
        scanner.close();

        for (int x = 0; x < width - 1; x++) {
            for (int y = 0; y < height; y++) {
                graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }
        for (int x = width - 1; x > 0; x--) {
            for (int y = 0; y < height; y++) {
                graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }
        for (int y = 0; y < height - 1; y++) {
            for (int x = 0; x < width; x++) {
                graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
            }
        }
        for (int y = height - 1; y > 0; y--) {
            for (int x = 0; x < width; x++) {
                graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
            }
        }

        double max = Double.NEGATIVE_INFINITY;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                max = Math.max(max, graph[y][x]);
            }
        }
        System.out.println((int) max);
    }
}