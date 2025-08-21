```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        final int firstCondition = 989;
        final int secondCondition = 711;
        final int outerLoopLimit = 748;
        final int outerLoopStep = 747;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            distance = distance + v;
            v = v + a * d;
            recursiveVelocityCalculator(0, t, 1, v1, v2, d, a, v, distance, firstCondition, secondCondition);
        }
        System.out.println(distance);
    }

    public static void recursiveVelocityCalculator(int i, int stop, int step, int v1, int v2, int d, int a, int v, int distance, int firstCondition, int secondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((firstCondition & secondCondition) > 0) {
            if (v - v2 > (d * (stop - i - 1))) {
                a *= -1;
                v = (d * (stop - i - 1)) + v2;
            }
        }
        distance = distance + v;
        v = v + a * d;
        recursiveVelocityCalculator(i + step, stop, step, v1, v2, d, a, v, distance, firstCondition, secondCondition);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the distance traveled by the object, and prints the result. The calculation is done in a loop that iterates a certain number of times, and the recursiveVelocityCalculator method is used to calculate the velocity and distance.

