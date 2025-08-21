Thought Process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java while maintaining the functionality and logic.
3. Ensure the Java code is correct and free from syntax errors.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        char[][] cells = new char[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < columnCount; j++) {
                cells[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (cells[i][j] == '.') {
                    if ((i + j) % 2 == 0) {
                        cells[i][j] = 'B';
                    } else {
                        cells[i][j] = 'W';
                    }
                }
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }
}
```

This solution reads the input, processes the cells based on the conditions specified, and then prints the modified cells in the desired format.
