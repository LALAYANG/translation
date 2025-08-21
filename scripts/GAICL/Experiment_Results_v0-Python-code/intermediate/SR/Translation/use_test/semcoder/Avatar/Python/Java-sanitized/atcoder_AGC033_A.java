import java.util.Scanner;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the first integer input

        int[][] graph = new int[height][width];
        for (int i = 0; i < height; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < width; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : Integer.MAX_VALUE;
            }
        }

        for (int x = 0; x < width - 1; x++) {
            for (int y = 0; y < height; y++) {
                if (graph[y][x + 1] > graph[y][x] + 1) {
                    graph[y][x + 1] = graph[y][x] + 1;
                }
            }
        }

        for (int x = width - 1; x > 0; x--) {
            for (int y = 0; y < height; y++) {
                if (graph[y][x - 1] > graph[y][x] + 1) {
                    graph[y][x - 1] = graph[y][x] + 1;
                }
            }
        }

        for (int y = 0; y < height - 1; y++) {
            for (int x = 0; x < width; x++) {
                if (graph[y + 1][x] > graph[y][x] + 1) {
                    graph[y + 1][x] = graph[y][x] + 1;
                }
            }
        }

        for (int y = height - 1; y > 0; y--) {
            for (int x = 0; x < width; x++) {
                if (graph[y - 1][x] > graph[y][x] + 1) {
                    graph[y - 1][x] = graph[y][x] + 1;
                }
            }
        }

        int maxDistance = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (graph[i][j] > maxDistance) {
                    maxDistance = graph[i][j];
                }
            }
        }

        System.out.println(maxDistance);
    }
}