
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> t = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            t.add(line);
        }

        int blackCellCount = 0;
        int white = 0;

        for (int i = 0; i < t.size(); i++) {
            for (int j = 0; j < t.get(i).length(); j++) {
                if (t.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }

                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
```
This code uses the `Scanner` class to read the input from the console, and the `ArrayList` class to store the lines of the input. It then iterates over the lines and characters of the input, and checks if the number of black cells and white cells is valid. If it is, it prints "YES" and returns. Otherwise, it prints "NO" and returns.

Note that this code assumes that the input is a valid tic-tac-toe board, with only '#' and ' ' characters. If the input is not a valid tic-tac-toe board, the code may produce incorrect results.
