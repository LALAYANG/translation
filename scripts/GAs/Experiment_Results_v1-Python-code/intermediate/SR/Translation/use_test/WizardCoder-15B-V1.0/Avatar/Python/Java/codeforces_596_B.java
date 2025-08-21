```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        TTest tTest = new TTest();
        double t = tTest.tTest(new double[]{38, 33, 68}, new double[]{3, 69, 79});
        int absoluteDifferenceSum = Math.abs(inputNumbers[0]);
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int i = 0; i < outerLoopLimit; i += maximumLoopCount) {
            int stop = Math.min(i + maximumLoopCount, outerLoopLimit);
            for (int j = i + 1; j < stop; j++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[j] - inputNumbers[j - 1]);
            }
        }
        System.out.println(absoluteDifferenceSum);
    }
}
```
