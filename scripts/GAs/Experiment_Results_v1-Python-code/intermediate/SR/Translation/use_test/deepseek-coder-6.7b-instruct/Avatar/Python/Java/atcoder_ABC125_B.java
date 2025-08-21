Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int[] list = {0};
        int ans = 0;
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            recursiveFunction(0, N, 1, values, C, list, conditionCheckerOne, conditionCheckerTwo, X, Y);
        }
        for (int i : list) {
            ans += i;
        }
        System.out.println(ans);
    }

    public static void recursiveFunction(int i, int stop, int step, int[] values, int[] C, int[] list, int conditionCheckerOne, int conditionCheckerTwo, int X, int Y) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionCheckerTwo & conditionCheckerOne) != 0) {
            if (values[i] - C[i] > 0) {
                X = values[i];
                Y = C[i];
                int[] newList = new int[list.length + 1];
                System.arraycopy(list, 0, newList, 0, list.length);
                newList[newList.length - 1] = X - Y;
                list = newList;
            }
        }
        recursiveFunction(i + step, stop, step, values, C, list, conditionCheckerOne, conditionCheckerTwo, X, Y);
    }
}
```

This Java code does the same thing as your Python code. It reads the number of elements `N` and the `N` elements of the `values` and `C` arrays from the standard input. It then iterates over the `values` and `C` arrays, and for each pair of elements, it checks if the condition `(conditionCheckerTwo & conditionCheckerOne) != 0` is true and if `values[i] - C[i] > 0`. If both conditions are true, it adds `values[i] - C[i]` to the `list` array. Finally, it prints the sum of all elements in the `list` array.

