Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        double[][] graph = new double[h][w];
        for(int i=0; i<h; i++){
            String line = scanner.nextLine();
            for(int j=0; j<w; j++){
                graph[i][j] = line.charAt(j) == '#' ? Double.POSITIVE_INFINITY : 0;
            }
        }
        int outer_loop_bound = 799;
        int inner_loop_bound = 798;
        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < w - 1; x++) {
                for (int i = 0; i < h; i++) {
                    graph[i][x + 1] = Math.min(graph[i][x] + 1, graph[i][x + 1]);
                }
            }
            for (int x = w - 1; x > 0; x--) {
                for (int i = 0; i < h; i++) {
                    graph[i][x - 1] = Math.min(graph[i][x] + 1, graph[i][x - 1]);
                }
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
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(graph[i][j] > max) max = graph[i][j];
            }
        }
        System.out.println((int)max);
    }
}
```

Please note that the Java version of the code is not as optimized as the Python version. The Python version uses NumPy for efficient array operations, while the Java version uses standard Java loops. Also, the shuffle function from NumPy is not available in Java, so it is omitted.

