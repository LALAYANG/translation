
Here is the Java code that translates the Python code:
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
        int absoluteDifferenceSum = 0;
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[j]);
            }
        }

        System.out.println(absoluteDifferenceSum);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute difference between each pair of numbers. The `for` loops are used to iterate over the input numbers and calculate the absolute difference between each pair. Finally, the `System.out.println()` method is used to print the result.
