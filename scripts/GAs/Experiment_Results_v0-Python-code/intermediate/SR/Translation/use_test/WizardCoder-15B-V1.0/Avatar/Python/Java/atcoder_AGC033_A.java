```java
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int height = 1000;
        int width = 1000;
        char[][][] graph = new char[1][width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                graph[0][i][j] = '#';
            }
        }
        long start = new Date().getTime();
        int result = difference(width, height, graph);
        long end = new Date().getTime();
        System.out.println(result);
        System.out.println("Time taken: " + (end - start) + " ms");
    }

    public static int difference(int width, int height, char[][][] graph) {
        int[][][] dp = new int[1][width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                dp[0][i][j] = graph[0][i][j] == '#' ? 0 : Integer.MAX_VALUE;
            }
        }
        for (int k = 0; k < width; k++) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == k) {
                        dp[0][i][j] = Math.min(dp[0][i][j], dp[0][k][j] + 1);
                    } else if (j == k) {
                        dp[0][i][j] = Math.min(dp[0][i][j], dp[0][i][k] + 1);
                    } else {
                        dp[0][i][j] = Math.min(dp[0][i][j], Math.min(dp[0][i][k] + 1, dp[0][k][j] + 1));
                    }
                }
            }
        }
        return dp[0][width - 1][height - 1];
    }
}
```
