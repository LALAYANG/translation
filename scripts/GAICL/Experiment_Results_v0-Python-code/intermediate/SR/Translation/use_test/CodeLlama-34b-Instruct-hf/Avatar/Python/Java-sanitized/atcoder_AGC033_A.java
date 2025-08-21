import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC033_A {
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
        int[][] newGraph = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                newGraph[i][j] = graph[i][j];
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (newGraph[i][j] == 0) {
                    newGraph[i][j] = 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (newGraph[i][j] > max) {
                    max = newGraph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}