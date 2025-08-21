```
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionOne = 207;
        int conditionTwo = 790;
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (conditionOne & conditionTwo) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    recursivePrinter(0, rowCount, 1);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void recursivePrinter(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (j % 2 == 0 && x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursivePrinter(j + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use global variables like `x` in Java. It is better to use local variables and pass them as arguments to the recursive function.
