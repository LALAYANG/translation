```java
import java.util.Scanner;

public class JavaProgram {
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
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                graph[x + 1] = Math.min(graph[x] + 1, graph[x + 1]);
            }
            for (int x = w - 1; x > 0; x--) {
                graph[x - 1] = Math.min(graph[x] + 1, graph[x - 1]);
            }
        }
        int[] shuffled = new int[3];
        for (int i = 0; i < 3; i++) {
            shuffled[i] = scanner.nextInt();
        }
        for (int y = 0; y < h - 1; y++) {
            graph[y + 1] = Math.min(graph[y] + 1, graph[y + 1]);
        }
        for (int y = h - 1; y > 0; y--) {
            graph[y - 1] = Math.min(graph[y] + 1, graph[y - 1]);
        }
        System.out.println(graph[h - 1][w - 1]);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
