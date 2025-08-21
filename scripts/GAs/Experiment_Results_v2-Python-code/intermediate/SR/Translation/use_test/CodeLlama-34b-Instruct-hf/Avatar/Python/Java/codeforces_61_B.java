```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = matrix[i][j];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        System.out.println(max);
    }
}
```
This Java code is a solution to the problem of finding the maximum sum of a 2D matrix. It uses a dynamic programming approach, where it first initializes a 2D array `dp` with the values of the input matrix `matrix`. Then, it iterates over the rows and columns of the matrix, updating the values of `dp` to be the maximum of the current value and the maximum of the previous row and column. Finally, it finds the maximum value in the `dp` array and prints it.

Note that this solution assumes that the input matrix is non-negative. If the input matrix can contain negative values, the solution would need to be modified to handle those cases.
