Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    static int v1, v2, t, d, a, v, distance;
    static final int FirstCondition = 989, SecondCondition = 711, OuterLoopLimit = 748, OuterLoopStep = 747;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        t = scanner.nextInt();
        d = scanner.nextInt();
        a = 1;
        v = v1;
        distance = 0;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            recursiveVelocityCalculator(0, t, 1);
        }

        System.out.println(distance);
    }

    static void recursiveVelocityCalculator(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((FirstCondition & SecondCondition) != 0) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
        }
        distance += v;
        v += a * d;
        recursiveVelocityCalculator(i + step, stop, step);
    }
}
```

Please note that the Java version of the code is slightly different from the Python version. The Python code uses global variables, while the Java version uses static variables. Also, the Python code uses the `input()` function to get the input, while the Java version uses the `Scanner` class to get the input.

