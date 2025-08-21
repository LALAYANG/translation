```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> board = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            board.add(line);
        }
        int blackCellCount = 0;
        int whiteCellCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i + 1).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (board.get(i + 1).charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || whiteCellCount == 0 || whiteCellCount == 3 || whiteCellCount == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
                blackCellCount = 0;
                whiteCellCount = 0;
            }
        }
        System.out.println("NO");
    }
}
```
This Java program takes a 3x3 tic-tac-toe board as input and checks if it is a valid board or not. A valid board is one where the number of black cells is 0, 3, or 4, and the number of white cells is 0, 3, or 4. If the board is valid, the program prints "YES", otherwise it prints "NO".

The program first initializes a list to store the board and a variable to store the number of black cells. It then reads the board from the user and stores it in the list.

Next, the program loops through the board and checks the number of black cells in each row and column. If the number of black cells is 0, 3, or 4, or the number of white cells is 0, 3, or 4, the program prints "YES" and returns.

If the board is not valid, the program prints "NO".

Note that this program assumes that the input board is a 3x3 matrix of characters, where '#' represents a black cell and ' ' represents a white cell. If the input board is in a different format, the program will need to be modified accordingly.
