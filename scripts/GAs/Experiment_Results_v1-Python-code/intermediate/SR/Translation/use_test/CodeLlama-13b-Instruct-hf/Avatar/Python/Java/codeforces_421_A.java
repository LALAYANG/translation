
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = scanner.nextInt();
        }
        int conditionCheckerTwo = 368;
        int conditionCheckerOne = 889;
        int loopBoundary = 955;
        int stepSize = 954;
        for (int i = 0; i < loopBoundary / stepSize; i++) {
            recursiveFunction(0, n, 1);
        }
    }

    public static void recursiveFunction(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (conditionCheckerTwo & conditionCheckerOne) {
            if (k + 1 in lista) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursiveFunction(k + step, stop, step);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print output to the console. The `recursiveFunction()` method is defined as a static method, which means it can be called without creating an instance of the `Solution` class.
