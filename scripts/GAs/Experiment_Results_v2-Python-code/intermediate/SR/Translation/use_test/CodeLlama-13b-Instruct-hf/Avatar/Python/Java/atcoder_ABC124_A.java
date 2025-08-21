
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Decrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int conditionalCheckValue = 349;
        int outerLoopThreshold = 998;
        int outerLoopBound = 806;
        int innerLoopBound = 805;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        int decrementStep = 1;
                        a = decrement(decrementStep, a);
                    } else {
                        b--;
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
Note that the `np.max` function in Python is replaced by `Math.max` in Java, and the `np.array` function is not needed since Java arrays are already mutable. Also, the `map` function in Python is not needed since Java has built-in support for reading input from the console.
