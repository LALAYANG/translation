```java
import java.util.Scanner;

public class Main {
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
                        a = decrement(1, a);
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

