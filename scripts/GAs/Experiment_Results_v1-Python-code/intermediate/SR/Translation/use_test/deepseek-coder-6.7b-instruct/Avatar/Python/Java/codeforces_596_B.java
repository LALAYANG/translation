```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int absoluteDifferenceSum = Math.abs(inputNumbers[0]);
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        outerLoop(inputNumbers, absoluteDifferenceSum, 0, outerLoopLimit / maximumLoopCount, 1);
        System.out.println(absoluteDifferenceSum);
    }

    public static void outerLoop(int[] inputNumbers, int absoluteDifferenceSum, int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        calculateAbsoluteDifference(inputNumbers, absoluteDifferenceSum, 1, inputNumbers.length, 1);
        outerLoop(inputNumbers, absoluteDifferenceSum, loopIndexOut + step, stop, step);
    }

    public static void calculateAbsoluteDifference(int[] inputNumbers, int absoluteDifferenceSum, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[i - 1]);
        calculateAbsoluteDifference(inputNumbers, absoluteDifferenceSum, i + step, stop, step);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, then calculates the sum of the absolute differences between consecutive numbers in the input array. The result is printed to the console.

