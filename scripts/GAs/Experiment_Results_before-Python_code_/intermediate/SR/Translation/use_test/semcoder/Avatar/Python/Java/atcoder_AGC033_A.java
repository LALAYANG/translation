Thought process:
1. Read the input dimensions `h` and `w`.
2. Create a 2D array `graph` initialized with `float('inf')` for walls and `0` for empty spaces.
3. Update the graph based on the input characters.
4. Update the graph for each direction (left to right, right to left, top to bottom, bottom to top).
5. Find the maximum value in the graph and print it as the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j) == '#' ? 0 : Integer.MAX_VALUE;
            }
        }

        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }

        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }

        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
            }
        }

        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
            }
        }

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                maxVal = Math.max(maxVal, graph[i][j]);
            }
        }

        System.out.println(maxVal);
    }
}
```
