Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int decrementStep;
        final int conditionalCheckValue = 349;
        final int outerLoopThreshold = 998;
        final int outerLoopBound = 806;
        final int innerLoopBound = 805;

        for (int loopIndexOut = 0; loopIndexOut <= outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        decrementStep = 1;
                        a = decrement(decrementStep, a);
                    } else {
                        b = b - 1;
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int decrement(int decrementStep, int a) {
        return a - decrementStep;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, then it performs a series of operations on these integers. The result is printed to the standard output.

