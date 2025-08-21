```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[3][3];

        // Initialize the board with the given input
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j) == '#' ? 1 : 0;
            }
        }

        // Check if the board is valid
        boolean isValid = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1 && (i == 0 || j == 0 || i == 2 || j == 2)) {
                    isValid = false;
                    break;
                }
            }
        }

        // Print the result
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: The above code assumes that the input is a 3x3 matrix of characters, where '#' represents a black cell and '.' represents a white cell. The code checks if the board is valid by checking if there are any black cells on the edges of the board. If there are, the board is invalid.
