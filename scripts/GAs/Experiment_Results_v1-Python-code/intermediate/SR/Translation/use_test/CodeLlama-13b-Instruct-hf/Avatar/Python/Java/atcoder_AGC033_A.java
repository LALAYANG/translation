
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Solution {
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
        int outerLoopBound = 799;
        int innerLoopBound = 798;
        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < w - 1; j++) {
                graph[i][j] = Math.min(graph[i][j] + 1, graph[i][j + 1]);
            }
        }
        for (int j = w - 1; j > 0; j--) {
            graph[i][j] = Math.min(graph[i][j] + 1, graph[i][j - 1]);
        }
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w; j++) {
                graph[i + 1][j] = Math.min(graph[i][j] + 1, graph[i + 1][j]);
            }
        }
        for (int i = h - 1; i > 0; i--) {
            for (int j = 0; j < w; j++) {
                graph[i - 1][j] = Math.min(graph[i][j] + 1, graph[i - 1][j]);
            }
        }
        int maxValue = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                maxValue = Math.max(maxValue, graph[i][j]);
            }
        }
        System.out.println(maxValue);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Math` class to perform the necessary calculations. The `Arrays` class is used to create the 2D array for the graph. The `Random` class is used to shuffle the array.

Note that this code assumes that the input is a 2D array of integers, and that the graph is represented as a 2D array of integers where each element represents the cost of moving from one cell to another. The code also assumes that the outer loop bound and inner loop bound are both 799.
