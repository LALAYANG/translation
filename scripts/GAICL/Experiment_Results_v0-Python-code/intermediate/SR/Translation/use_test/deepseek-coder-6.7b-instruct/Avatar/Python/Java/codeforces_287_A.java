Here is the Java equivalent of your Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<List<Character>> board = new ArrayList<>();
    static int blackCellCount, white;
    static boolean correct;

    public static void main(String[] args) {
        processBoardInput(0, 4, 1);
        checkBoard();
        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void processBoardInput(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Character> row = new ArrayList<>();
        for (char c : line.toCharArray()) {
            row.add(c);
        }
        board.add(row);
        processBoardInput(i + step, stop, step);
    }

    public static void checkBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).get(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i).get(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i + 1).get(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (board.get(i + 1).get(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    correct = true;
                    break;
                }
                blackCellCount = 0;
                white = 0;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a 3x3 board from the standard input, checks if the board has a winning configuration, and prints "YES" if it does, "NO" otherwise. The `processBoardInput` method reads the board from the standard input, and the `checkBoard` method checks if the board has a winning configuration.

