import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] differenceMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                differenceMatrix[i][j] = matrix[i][j] - matrix[i][j - 1];
            }
        }
        int[][] resultMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] = (differenceMatrix[i][j] % 2 == 0 && differenceMatrix[i][j] <= sa * 2) ? 1 : 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}