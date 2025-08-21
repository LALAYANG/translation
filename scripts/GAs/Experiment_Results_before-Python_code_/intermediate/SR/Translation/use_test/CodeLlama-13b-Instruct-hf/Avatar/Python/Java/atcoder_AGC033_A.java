```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] graph = new int[h][w];

        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
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

        int maxValue = Integer.MIN_VALUE;
        for (int[] row : graph) {
            for (int value : row) {
                maxValue = Math.max(maxValue, value);
            }
        }

        System.out.println(maxValue);
    }
}
```
This solution uses the same approach as the Python code, but it is written in Java. It first reads the input from the user and initializes a 2D array `graph` with the values from the input. Then, it iterates over the array and updates the values of the cells based on the rules of the problem. Finally, it finds the maximum value in the array and prints it to the console.

Note that the `Math.min()` and `Math.max()` methods are used to find the minimum and maximum values of two numbers, respectively. The `Integer.MAX_VALUE` and `Integer.MIN_VALUE` constants are used to represent the maximum and minimum values of an integer, respectively.
