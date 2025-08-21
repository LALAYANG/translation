
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();

        int outerLoopLimit = 223;
        int divisor = 222;

        for (int i = 0; i < outerLoopLimit / divisor; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.println((int) (commonRatio ** (j - 1) * (x + principal / (1 - commonRatio)) - principal / (1 - commonRatio)));
            }
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses nested loops to iterate over the values of `i` and `j` and print the result of the formula.

Note that the `**` operator in Java is used to raise a number to a power, which is similar to the `**` operator in Python. The `int` cast is used to convert the result of the formula to an integer.
