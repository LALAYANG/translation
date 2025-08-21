
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] chessboard = new String[n][m];
        int checkConditionOne = 485;
        int checkConditionTwo = 319;
        for (int i = 0; i < n; i++) {
            String currentRow = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if (checkConditionOne & checkConditionTwo) {
                    if (currentRow.charAt(j) == '.') {
                        if ((i + j) % 2 == 0) {
                            currentRow = currentRow.substring(0, j) + "W" + currentRow.substring(j + 1);
                        } else {
                            currentRow = currentRow.substring(0, j) + "B" + currentRow.substring(j + 1);
                        }
                    }
                }
            }
            chessboard[i] = currentRow;
        }
        for (String[] row : chessboard) {
            System.out.println(String.join("", row));
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String.join()` method to concatenate the elements of the `String[][]` array into a single `String`. The `String.charAt()` method is used to access the characters of the `String` objects in the `String[][]` array.
