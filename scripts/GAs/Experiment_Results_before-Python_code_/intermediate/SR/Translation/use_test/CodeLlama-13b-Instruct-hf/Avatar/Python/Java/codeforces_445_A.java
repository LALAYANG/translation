
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Checkerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        board[i][j] = 'W';
                    } else {
                        board[i][j] = 'B';
                    }
                } else {
                    board[i][j] = row.charAt(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `char[][]` array to store the checkerboard. The `if` statement checks if the current cell is a dot, and if it is, it sets the value of the cell to 'W' or 'B' based on the parity of the row and column indices. Finally, the code uses a nested `for` loop to print the checkerboard to the console.
