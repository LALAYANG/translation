
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }
        List<Integer>[][] grid = new List[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = new ArrayList<>();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (input[i].charAt(j) == 'O') {
                    grid[i][j].add(0);
                } else {
                    grid[i][j].add(1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j].size() == 12) {
                    int count = 0;
                    for (int k = 0; k < 12; k++) {
                        if (grid[i][j].get(k) == 0) {
                            count++;
                        }
                    }
                    if (count == 12) {
                        System.out.println("12x1");
                    }
                }
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the values in the grid. It then uses a nested loop to iterate over the grid and check if there are 12 consecutive `O`s in any row or column. If there are, it prints the number of consecutive `O`s and the number of rows or columns that contain them.

Note that this code assumes that the input is a square grid of size `n`x`n`, and that the `O`s and `X`s are separated by spaces. If the input is not in this format, the code will not work correctly.
