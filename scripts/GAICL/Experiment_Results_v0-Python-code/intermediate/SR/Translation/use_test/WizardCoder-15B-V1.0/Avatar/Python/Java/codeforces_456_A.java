```java
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        int[][][] matrix = new int[1][matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            int[] row = new int[2];
            row[0] = sc.nextInt();
            row[1] = sc.nextInt();
            matrix[0][i] = row;
        }
        Arrays.sort(matrix[0], (a, b) -> b[1] - a[1]);
        int[] a = matrix[0][0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;

        for (int i = 0; i < matrixSize; i++) {
            int[] row = matrix[0][i];
            if (row[0] & conditionB == conditionA) {
                if (row[1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = row;
        } else {
            System.out.println("Poor Alex");
        }

        for (int i = 0; i < loopBound; i += limit) {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

        sc.close();
    }
}
```

Explanation:

- We first read the input matrix size and the elements of the matrix.
- We sort the matrix in descending order of the second element of each row.
- We initialize the variable `a` to the first row of the sorted matrix.
- We then loop through the remaining rows of the matrix and check if the first element of each row is a bitwise AND of `conditionA` and `conditionB`. If it is, we compare the second element of the row with the second element of `a`. If the second element of the row is greater than the second element of `a`, we print "Happy Alex" and break out of the loop. Otherwise, we update `a` to the current row. If we have looped through all the rows and haven't found a row that satisfies the condition, we print "Poor Alex".
- We then loop through the loop bound in steps of `limit` and print the current value of `i`.
- We close the scanner.
