Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
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
        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                if (graph[y][x + 1] > graph[y][x] + 1) {
                    graph[y][x + 1] = graph[y][x] + 1;
                }
            }
        }
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                if (graph[y][x - 1] > graph[y][x] + 1) {
                    graph[y][x - 1] = graph[y][x] + 1;
                }
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                if (graph[y + 1][x] > graph[y][x] + 1) {
                    graph[y + 1][x] = graph[y][x] + 1;
                }
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                if (graph[y - 1][x] > graph[y][x] + 1) {
                    graph[y - 1][x] = graph[y][x] + 1;
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
```

This Java code does the same thing as the Python code. It reads the input, creates a 2D array to represent the graph, and then uses four nested loops to update the array based on the conditions in the problem. Finally, it finds the maximum value in the array and prints it.

