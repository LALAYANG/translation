Here is the Java translation of the provided Python code. Note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function, so it is not included in the Java code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 149;
        int conditionTwo = 231;
        int x = 0;

        if (conditionOne != 0 && conditionTwo != 0) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    recursivePrint(0, rowCount, 1, x, k);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void recursivePrint(int j, int stop, int step, int x, int k) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursivePrint(j + step, stop, step, x, k);
    }
}
```

This Java code reads the input from the console, checks the conditions, and prints the output as per the Python code. The `recursivePrint` method is a recursive method that prints the characters 'L' and 'S' as per the Python code.

