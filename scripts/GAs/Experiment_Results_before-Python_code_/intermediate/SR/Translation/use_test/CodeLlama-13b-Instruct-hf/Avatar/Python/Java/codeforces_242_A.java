```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] games = new int[x - a + 1][y - b + 1];
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games[i - a][j - b] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                if (games[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                if (games[i][j] == 1) {
                    System.out.println(i + 1 + " " + (j + 1));
                }
            }
        }
    }
}
```
This code first reads the input from the user and stores it in the variables `x`, `y`, `a`, and `b`. It then creates a 2D array `games` to store the results.

The code then iterates over the range of values from `a` to `x` and for each value of `i`, it iterates over the range of values from `b` to `y` and for each value of `j`, it checks if `i` is greater than `j`. If it is, it sets the value of the corresponding element in the `games` array to 1.

After the loops are finished, the code calculates the number of elements in the `games` array that are equal to 1 and prints it. It then iterates over the `games` array and for each element that is equal to 1, it prints the corresponding row and column indices.

Note that the code uses the `Scanner` class to read the input from the user and the `System.out.println()` method to print the output.
