
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
This code reads the input matrix from the standard input, adds 1 to each element, and then prints the resulting matrix to the standard output.

Note that this code assumes that the input matrix is a square matrix, and it will not work correctly if the input matrix is not a square matrix. Also, this code assumes that the input matrix is a matrix of integers, and it will not work correctly if the input matrix is a matrix of other types of data.
