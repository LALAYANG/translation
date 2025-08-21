```java
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        String[] input = "1000 1000".split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        String[][] graph = new String[h][w];
        for (int i = 0; i < h; i++) {
            String[] row = Arrays.copyOfRange(input, i * w, (i + 1) * w);
            for (int j = 0; j < w; j++) {
                if (row[j].equals("#")) {
                    graph[i][j] = "#";
                } else {
                    graph[i][j] = ".";
                }
            }
        }
        int outerLoopBound = 113;
        int innerLoopBound = 112;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int x = 0; x < w - 1; x++) {
                for (int y = 0; y < h; y++) {
                    if (graph[y][x + 1].equals("#")) {
                        graph[y][x + 1] = graph[y][x];
                    } else {
                        graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
                    }
                }
            }
        }
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                if (graph[y][x - 1].equals("#")) {
                    graph[y][x - 1] = graph[y][x];
                } else {
                    graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
                }
            }
        }
        for (int rowIndex = h - 1; rowIndex > 0; rowIndex--) {
            for (int colIndex = 0; colIndex < w; colIndex++) {
                if (graph[rowIndex - 1][colIndex].equals("#")) {
                    graph[rowIndex - 1][colIndex] = graph[rowIndex][colIndex];
                } else {
                    graph[rowIndex - 1][colIndex] = Math.min(graph[rowIndex][colIndex] + 1, graph[rowIndex - 1][colIndex]);
                }
            }
        }
        for (int rowIndex = 0; rowIndex < h - 1; rowIndex++) {
            for (int colIndex = 0; colIndex < w; colIndex++) {
                if (graph[rowIndex + 1][colIndex].equals("#")) {
                    graph[rowIndex + 1][colIndex] = graph[rowIndex][colIndex];
                } else {
                    graph[rowIndex + 1][colIndex] = Math.min(graph[rowIndex][colIndex] + 1, graph[rowIndex + 1][colIndex]);
                }
            }
        }
        LocalDateTime start = LocalDateTime.now();
        int[] arr = {15, 79, 20};
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j].equals("#")) {
                    continue;
                }
                int value = Integer.parseInt(graph[i][j]);
                if (value > max) {
                    max = value;
                }
            }
        }
        LocalDateTime end = LocalDateTime.now();
        long duration = ChronoUnit.MICROS.between(start, end);
        System.out.println(max + " " + duration);
    }
}
```

Test input:
1000 1000
..........................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................
Expected output:
729 
