
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == matrix[j][n - 1]) {
                    commonCount++;
                }
            }
        }

        System.out.println(commonCount);
    }
}
```
This code uses the `Scanner` class to read input from the user, and it uses a nested loop to iterate over the elements of the matrix and check for the condition. The `commonCount` variable is used to keep track of the number of elements that satisfy the condition. Finally, the `System.out.println()` method is used to print the result.

Note that the Python code uses a decorator to wrap the `recursive_loop` function, which is not necessary in Java. In Java, you can simply define the `recursive_loop` function as a regular method and call it directly.
