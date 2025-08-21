import java.util.*;
import java.net.*;
import java.io.*;
import java.time.*;
import java.text.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.apache.commons.math3.stat.inference.*;

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
                graph[i][j] = line.charAt(j) == '#' ? Double.POSITIVE_INFINITY : 0;
            }
        }
        for (int x = 0; x < difference(width, 1); x++) {
            for (int y = 0; y < height; y++) {
                if (x > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y][x - 1] + 1);
                }
                if (y > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y - 1][x] + 1);
                }
            }
        }
        for (int x = width - 1; x > 0; x--) {
            for (int y = 0; y < height; y++) {
                if (x < width - 1) {
                    graph[y][x] = Math.min(graph[y][x], graph[y][x + 1] + 1);
                }
                if (y > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y - 1][x] + 1);
                }
            }
        }
        for (int y = 0; y < height - 1; y++) {
            for (int x = 0; x < width; x++) {
                if (y < height - 1) {
                    graph[y][x] = Math.min(graph[y][x], graph[y + 1][x] + 1);
                }
                if (x > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y][x - 1] + 1);
                }
            }
        }
        for (int y = height - 1; y > 0; y--) {
            for (int x = 0; x < width; x++) {
                if (y > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y - 1][x] + 1);
                }
                if (x > 0) {
                    graph[y][x] = Math.min(graph[y][x], graph[y][x - 1] + 1);
                }
            }
        }
        System.out.println((int)Math.max(Arrays.stream(graph).flatMapToDouble(Arrays::stream).max().getAsDouble(), 0));
    }

    public static int difference(int a, int b) {
        return discount(a, b);
    }

    public static int discount(int a, int b) {
        return reduce(a, b);
    }

    public static int reduce(int a, int b) {
        return decrement(a, b);
    }

    public static int decrement(int a, int b) {
        return minus(a, b);
    }

    public static int minus(int a, int b) {
        return deduct(a, b);
    }

    public static int deduct(int a, int b) {
        return subtract(a, b);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}