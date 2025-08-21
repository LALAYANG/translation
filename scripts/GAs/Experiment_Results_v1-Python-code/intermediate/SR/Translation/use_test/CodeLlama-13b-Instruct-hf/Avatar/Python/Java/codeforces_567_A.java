
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.length; i++) {
                if (firstConditionChecker & secondConditionChecker) {
                    if (i == 0) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                        continue;
                    } else if (i == lista.length - 1) {
                        System.out.print(lista[lista.length - 1] - lista[i] + " ");
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[i - 1] + " ");
                    }
                }
                if (thirdConditionChecker & fourthConditionChecker) {
                    if (lista[lista.length - 1] - lista[i] > lista[i] - lista[0]) {
                        System.out.print(lista[lista.length - 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[0] + " ");
                    }
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print output to the console. The `for` loops in the Java code are similar to the `for` loops in the Python code, but the syntax for the `if` statements is slightly different.
