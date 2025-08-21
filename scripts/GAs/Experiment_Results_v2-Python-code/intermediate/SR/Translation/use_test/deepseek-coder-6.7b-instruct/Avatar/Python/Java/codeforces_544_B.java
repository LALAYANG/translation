```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conditionOne = 149;
        int conditionTwo = 231;
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (conditionOne == 1 && conditionTwo == 1) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    recursivePrint(0, rowCount, 1, currentRow, k, x);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    public static void recursivePrint(int j, int stop, int step, int currentRow, int k, int x) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (currentRow % 2 == j % 2 && x < k) {
            System.out.print("L");
            x++;
        } else {
            System.out.print("S");
        }
        recursivePrint(j + step, stop, step, currentRow, k, x);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if the conditions are met, and if so, prints the desired output. The recursivePrint method is a helper method that prints the 'L' and 'S' characters based on the conditions.

