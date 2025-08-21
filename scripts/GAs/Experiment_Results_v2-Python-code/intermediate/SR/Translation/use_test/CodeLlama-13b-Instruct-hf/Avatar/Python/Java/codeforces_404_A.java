
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[][] matrix = new String[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = sc.next();
            }
        }
        boolean isMagic = true;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
                if (i == matrixSize - j - 1) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
                if (i != j && i != matrixSize - j - 1) {
                    if (matrix[i][j] != matrix[i][j]) {
                        isMagic = false;
                        break;
                    }
                }
            }
        }
        if (isMagic) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses a 2D array to store the input matrix, and then checks if the matrix is magic by iterating through each element and checking if it is equal to the corresponding element in the other diagonal. If any element is not equal, the code sets the `isMagic` variable to `false` and breaks out of the loop. If the loop completes successfully, the code prints "YES" if `isMagic` is `true`, and "NO" otherwise.
