import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numQueries = scanner.nextInt();
        int sa = scanner.nextInt();
        int[][] saArray = new int[numElements][numElements];
        for (int i = 0; i < numElements; i++) {
            for (int j = 0; j < numElements; j++) {
                saArray[i][j] = scanner.nextInt();
            }
        }
        int[][] ssArray = new int[numQueries][numQueries];
        for (int i = 0; i < numQueries; i++) {
            for (int j = 0; j < numQueries; j++) {
                ssArray[i][j] = scanner.nextInt();
            }
        }
        int[][] resultArray = new int[numQueries][numQueries];
        for (int i = 0; i < numQueries; i++) {
            for (int j = 0; j < numQueries; j++) {
                resultArray[i][j] = subtract(saArray[i][j], ssArray[i][j]);
            }
        }
        for (int i = 0; i < numQueries; i++) {
            for (int j = 0; j < numQueries; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}