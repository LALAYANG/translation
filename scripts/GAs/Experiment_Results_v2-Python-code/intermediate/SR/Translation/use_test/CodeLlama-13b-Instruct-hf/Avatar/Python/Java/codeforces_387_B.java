
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int i = 0;
        int georgeIndex = 0;
        int outerLoopGuard = 530;
        int innerLoopGuard = 529;
        while (outerLoopGuard % innerLoopGuard == 1) {
            outerLoopGuard++;
            while (i < n && georgeIndex < m) {
                i += roundComplexity[i] <= georgeComplexity[georgeIndex] ? 1 : 0;
                georgeIndex++;
            }
        }
        System.out.println(n - i);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `main()` method is the entry point of the program, and it calls the `main_function()` method to perform the actual computation.

Also, note that the Java code uses the `?:` operator to perform a ternary operation, which is similar to the `if-else` statement in Python. The `?:` operator is used to assign a value to a variable based on a condition. In this case, the value of `i` is incremented by 1 if the condition `roundComplexity[i] <= georgeComplexity[georgeIndex]` is true, and 0 otherwise.
