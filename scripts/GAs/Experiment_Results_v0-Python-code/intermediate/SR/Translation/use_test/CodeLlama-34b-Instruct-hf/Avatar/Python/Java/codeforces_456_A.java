
Here's the Java code that implements the same logic as the Python code:
```java
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] m = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        Arrays.sort(m, (a, b) -> b[0] - a[0]);
        int a = m[0][0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;

        recursiveFunction(0, loopBound / limit, 1);
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 1; i < m.length; i++) {
            if (bitwiseAnd(conditionA, conditionB)) {
                if (m[i][1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = m[i];
        } else {
            System.out.println("Poor Alex");
        }
        recursiveFunction(loopIndexOut + step, stop, step);
    }

    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }
}
```
Note that the Java code uses the `Arrays.sort()` method to sort the 2D array, and the `bitwiseAnd()` method to perform the bitwise AND operation. The `recursiveFunction()` method is called with the initial values of `loopIndexOut`, `stop`, and `step`, and it recursively calls itself with the updated values until the base case is reached.
