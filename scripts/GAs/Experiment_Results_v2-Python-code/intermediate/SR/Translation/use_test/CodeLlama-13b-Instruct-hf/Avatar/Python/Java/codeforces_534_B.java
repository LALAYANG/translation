
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class VelocityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int firstCondition = 989;
        int secondCondition = 711;
        int outerLoopLimit = 748;
        int outerLoopStep = 747;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            recursiveVelocityCalculator(0, t, 1);
        }
        System.out.println(distance);
    }

    private static void recursiveVelocityCalculator(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (firstCondition & secondCondition) {
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `recursiveVelocityCalculator()` method is a recursive function that calculates the velocity of the object at each step, and the `main()` method is the entry point of the program.
