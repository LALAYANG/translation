```java
import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] chessboard = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chessboard[i][j] = 'B';
                    } else {
                        chessboard[i][j] = 'W';
                    }
                } else {
                    if (j % 2 == 0) {
                        chessboard[i][j] = 'W';
                    } else {
                        chessboard[i][j] = 'B';
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(chessboard[i][j]);
            }
            System.out.println();
        }
    }
}
```

Test input:
2 5
.....
.....

Expected output:
BWBWB
WBWBW 
