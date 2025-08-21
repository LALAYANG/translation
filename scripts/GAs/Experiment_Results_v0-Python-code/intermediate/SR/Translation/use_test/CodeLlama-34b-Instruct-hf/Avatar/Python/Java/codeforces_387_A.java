```java
import java.util.Scanner;

public class CalculateTimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input
        String[] input = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(input[0]);
        int minuend = Integer.parseInt(input[1]);

        // Calculate the initial product
        int variable_3_4 = 60;
        minuend += calculateInitialProduct(variable_3_4, h1);

        // Get the second input
        input = scanner.nextLine().split(":");
        int multiplicand = Integer.parseInt(input[0]);
        int m2 = Integer.parseInt(input[1]);

        // Calculate the product
        int multiplier = 60;
        m2 += calculateProduct(multiplier, multiplicand);

        // Calculate the difference
        int remainder = calculateDifference(m2, minuend);

        // Calculate the remainder
        int divisor = 1440;
        int result = calculateRemainder(m2, divisor);

        // Print the result
        System.out.printf("%02d:%02d", result / 60, result % 60);
    }

    private static int calculateInitialProduct(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }

    private static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    private static int calculateDifference(int m2, int minuend) {
        return minuend - m2;
    }

    private static int calculateRemainder(int m2, int divisor) {
        return m2 % divisor;
    }
}
```
Note: The `calculateInitialProduct` method is not used in the Python code, but it is included in the Java code for consistency.
