```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] t = new String[4][4];
        for (int i = 0; i < 4; i++) {
            String[] row = scanner.nextLine().split("");
            for (int j = 0; j < 4; j++) {
                t[i][j] = row[j];
            }
        }
        int black = 0;
        int white = 0;
        boolean correct = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = true;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code first reads the input from the user and stores it in a 2D array `t`. It then initializes two variables `black` and `white` to keep track of the number of black and white squares in the grid.

The code then iterates over the grid and checks if the number of black and white squares in each row and column is correct. If the number of black or white squares is not correct, it sets the `correct` variable to `true` and breaks out of the loop.

Finally, the code prints "YES" if the `correct` variable is `true`, and "NO" otherwise.
