```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }

        int absoluteDifferenceSum = 0;
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int i = 0; i < n; i++) {
            int step = 1;
            int stop = i + step;
            int LoopIndexOut = 0;
            while (step > 0 && LoopIndexOut < stop) {
                absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[i - 1]);
                LoopIndexOut += step;
            }
        }

        System.out.println(absoluteDifferenceSum);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
