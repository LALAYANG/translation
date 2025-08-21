```java
import java.util.Scanner;

public class MatrixChecker {
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
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < matrixSize; i++) {
            diagonalSum1 += Integer.parseInt(matrix[i][i]);
            diagonalSum2 += Integer.parseInt(matrix[i][matrixSize - i - 1]);
        }

        if (diagonalSum1 != diagonalSum2) {
            isMagic = false;
        }

        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < matrixSize; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j = 0; j < matrixSize; j++) {
                rowSum += Integer.parseInt(matrix[i][j]);
                colSum += Integer.parseInt(matrix[j][i]);
            }
            if (rowSum != colSum) {
                isMagic = false;
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
Note: The above code assumes that the input matrix is a square matrix. If the matrix is not square, the code will need to be modified accordingly.
