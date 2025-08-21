```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commonRatio = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        int outerLoopStart = 388;
        int outerLoopEnd = 387;

        outerLoop(0, outerLoopStart / outerLoopEnd, 1);
    }

    public static void outerLoop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        innerLoop(2, 12, 1);
        outerLoop(LoopIndexOut + step, stop, step);
    }

    public static void innerLoop(int innerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
            return;
        }
        System.out.println(int(commonRatio ** (innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)));
        innerLoop(innerLoopIndex + step, stop, step);
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a standard Java function. If you need to use this function in Java, you will need to find a Java implementation of it or write your own.
