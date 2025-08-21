Here is the Java translation of the provided Python code. Note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function, so it is not included in the Java code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 207;
        int condition_two = 790;
        Scanner scanner = new Scanner(System.in);
        int row_count = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (condition_one == condition_two) {
            if (k <= Math.max(row_count * row_count / 2, row_count * row_count - row_count * row_count / 2)) {
                System.out.println("YES");
                for (int current_row = 0; current_row < row_count; current_row++) {
                    recursivePrinter(0, row_count, 1, current_row, k, x);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void recursivePrinter(int j, int stop, int step, int current_row, int k, int x) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_row % 2 == j % 2 && x < k) {
            System.out.print("L");
            x = x + 1;
        } else {
            System.out.print("S");
        }
        recursivePrinter(j + step, stop, step, current_row, k, x);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if they are equal to `condition_one` and `condition_two`, and if they are, it checks if `k` is less than or equal to the maximum of two values. If it is, it prints "YES" and then prints a grid of "L" and "S" characters. If `k` is not less than or equal to the maximum value, it prints "NO".

