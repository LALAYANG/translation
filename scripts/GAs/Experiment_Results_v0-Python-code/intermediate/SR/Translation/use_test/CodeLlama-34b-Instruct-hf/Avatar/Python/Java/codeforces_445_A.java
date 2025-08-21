```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String row = scanner.next();
            board.add(row);
        }
        int minBound = 758;
        int maxBound = 139;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (board.get(i).charAt(j) == '.') {
                    if (i + j & 1) {
                        board.set(i, board.get(i).substring(0, j) + "W" + board.get(i).substring(j + 1));
                    } else {
                        board.set(i, board.get(i).substring(0, j) + "B" + board.get(i).substring(j + 1));
                    }
                }
            }
        }
        for (String row : board) {
            System.out.println(row);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `ArrayList` class to store the board. The `for` loops are used to iterate over the rows and columns of the board, and the `if` statements are used to check if a cell is empty and if it should be filled with a 'W' or a 'B'. The `substring` method is used to update the board with the new values.
