```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int blackCount = 0;
        int whiteCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    blackCount++;
                } else {
                    whiteCount++;
                }
            }
        }
        if (blackCount == 0 || blackCount == 3 || whiteCount == 0 || whiteCount == 3 || whiteCount == 4 || blackCount == 4) {
            System.out.println("NO");
            return;
        }
        int[][] newBoard = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newBoard[i][j] = board[i][j];
            }
        }
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newBoard[i][j] == 1) {
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (rowSum[i] == 3 || rowSum[i] == 0) {
                System.out.println("NO");
                return;
            }
            if (colSum[i] == 3 || colSum[i] == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
```
