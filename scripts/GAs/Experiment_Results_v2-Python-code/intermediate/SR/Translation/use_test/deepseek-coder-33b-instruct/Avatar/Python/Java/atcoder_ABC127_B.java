Here is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        int outerLoopStart = 388;
        int outerLoopEnd = 387;

        outerLoop(0, outerLoopStart / outerLoopEnd, 1, commonRatio, D, x);
    }

    public static void outerLoop(int LoopIndexOut, int stop, int step, int commonRatio, int D, int x) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        innerLoop(2, 12, 1, commonRatio, D, x);
        outerLoop(LoopIndexOut + step, stop, step, commonRatio, D, x);
    }

    public static void innerLoop(int innerLoopIndex, int stop, int step, int commonRatio, int D, int x) {
        if (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
            return;
        }

        System.out.println((int) (Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)));
        innerLoop(innerLoopIndex + step, stop, step, commonRatio, D, x);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to perform a t-test in Java, you can use the Apache Commons Math library.

