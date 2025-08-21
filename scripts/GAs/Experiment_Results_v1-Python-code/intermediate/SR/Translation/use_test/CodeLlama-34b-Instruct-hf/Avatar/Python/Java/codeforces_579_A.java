```java
import java.util.concurrent.ThreadLocalRandom;

public class SumCalculator {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;
        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter++;
            while (Math.log2(n) % 1 != 0) {
                int increment = 1;
                int sumResult = calculateSum(x, increment);
                x = sumResult;
                n -= Math.pow(2, (int) Math.log2(n));
            }
        }
        System.out.println(x);
    }

    public static int calculateSum(int x, int increment) {
        return x + increment;
    }
}
```
Note: The `ThreadLocalRandom` class is used to generate random numbers in Java, but it is not used in the above code as it is not necessary for the calculation of the sum.
