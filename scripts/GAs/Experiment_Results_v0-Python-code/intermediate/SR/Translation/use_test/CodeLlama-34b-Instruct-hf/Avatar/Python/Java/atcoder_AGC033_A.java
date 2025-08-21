```
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] graph = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = graph[i][j] - graph[i][j - 1];
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }

