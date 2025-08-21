```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = sc.nextInt();
        int sb = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] - sa;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] % 2 == 0 && result[i][j] <= sa * 2) {
                    System.out.print("1\n");
                } else {
                    System.out.print("0\n");
                }
            }
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It takes the input in the same format as the Python code, and outputs the result in the same format. The Java code uses a 2D array to store the input matrix, and then performs the necessary operations to get the desired output.
