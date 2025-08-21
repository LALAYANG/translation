```java
import java.util.Scanner;

public class Decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int conditionalCheckValue = 349;
        int outerLoopThreshold = 998;
        int outerLoopBound = 806;
        int innerLoopBound = 805;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        a--;
                    } else {
                        b--;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```
Note: In Java, we use the `Math.max()` method to find the maximum of two numbers, instead of the `np.max()` method used in Python. Also, we use the `--` operator to decrement a variable by 1, instead of the `decrement()` function used in Python.
