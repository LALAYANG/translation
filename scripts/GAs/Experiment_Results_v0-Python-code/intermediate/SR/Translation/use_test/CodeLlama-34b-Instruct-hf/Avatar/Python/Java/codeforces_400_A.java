
Here's the translated Java code:
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> validDimensions = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                validDimensions.add(i);
            }
        }

        for (int i = 0; i < validDimensions.size(); i++) {
            int a = validDimensions.get(i);
            int b = n / a;
            if (help(a, b, matrix)) {
                System.out.println(a + "x" + b);
            }
        }
    }

    public static boolean help(int a, int b, int[][] matrix) {
        int[][] s = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (s[i][j] == 0) {
                    s[i][j] = 1;
                } else {
                    s[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (s[i][j] == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
```
Note that the `help` method has been modified to take an `int[][]` matrix as input, and the `main` method has been modified to call the `help` method with the appropriate arguments. Additionally, the `help` method now returns a `boolean` value indicating whether the matrix is valid or not.
