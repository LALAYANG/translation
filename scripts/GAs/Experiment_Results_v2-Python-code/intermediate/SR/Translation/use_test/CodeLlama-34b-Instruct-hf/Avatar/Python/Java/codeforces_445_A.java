```java
import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] chessboard = new String[n][m];
        for (int i = 0; i < n; i++) {
            String currentRow = sc.next();
            for (int j = 0; j < m; j++) {
                if (currentRow.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        chessboard[i][j] = "W";
                    } else {
                        chessboard[i][j] = "B";
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
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the Java code does not include the t-test functionality.
