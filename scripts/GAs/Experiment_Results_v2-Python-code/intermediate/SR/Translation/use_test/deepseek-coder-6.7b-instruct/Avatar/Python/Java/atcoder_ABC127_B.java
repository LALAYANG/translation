Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        outerLoop(commonRatio, D, x, 388, 387, 1);
    }

    private static void outerLoop(int commonRatio, int D, int x, int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        innerLoop(commonRatio, D, x, 2, 12, 1);
        outerTTestInd(84, 66, 16, 16, 86, 71);
        outerLoop(commonRatio, D, x, loopIndexOut + step, stop, step);
    }

    private static void innerLoop(int commonRatio, int D, int x, int innerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
            return;
        }
        int result = (int) (Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio));
        System.out.println(result);
        innerLoop(commonRatio, D, x, innerLoopIndex + step, stop, step);
    }

    private static void outerTTestInd(int a1, int a2, int a3, int b1, int b2, int b3) {
        // Implement your t-test here
    }
}
```

Please note that the t-test function is not implemented in this code. You need to implement it according to your needs.

Also, the Python code uses the `scipy.stats` module for the t-test, which is not available in Java. You may need to use a library or implement the t-test function yourself.

