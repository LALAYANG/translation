Thought process:
1. Understand the provided code snippet and the problem it aims to solve.
2. Identify the key components and functions used in the code.
3. Translate the code snippet into Java code while maintaining the functionality.

```java
import java.util.Arrays;
import java.util.Scanner;

public class AlexProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] m = new int[matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }
        Arrays.sort(m, (a, b) -> b[1] - a[1]);
        int[] a = m[0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;

        recursiveFunction(0, loopBound / limit, 1, m, a, conditionA, conditionB);
    }

    private static void recursiveFunction(int LoopIndexOut, int stop, int step, int[][] m, int[] a, int conditionA, int conditionB) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int[] i : m) {
            if ((conditionA & conditionB) != 0) {
                if (i[1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
                a = i;
            }
        } else {
            System.out.println("Poor Alex");
        }
        recursiveFunction(LoopIndexOut + step, stop, step, m, a, conditionA, conditionB);
    }
}
```

This solution translates the provided Python code snippet into a Java program that mimics the functionality of the original code.
