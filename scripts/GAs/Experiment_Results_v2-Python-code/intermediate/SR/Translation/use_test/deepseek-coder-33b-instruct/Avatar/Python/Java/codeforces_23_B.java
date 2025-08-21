Here is the Java equivalent of the provided Python code. Note that Java does not have built-in support for decorators, scikit-learn, or scipy, so these parts of the code are not included.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int outerLoopLimit = 172;
        int innerLoopLimit = 171;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int value = new Scanner(System.in).nextInt();
        if (value < 2) {
            System.out.println(0);
        }
        if (value >= 2) {
            System.out.println(value - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}
```

This Java code does not include the decorator functionality or the t-test functionality from the original Python code. The t-test functionality is not included because Java does not have a built-in library for statistical analysis like scipy in Python. The decorator functionality is not included because Java does not support decorators in the same way as Python.

