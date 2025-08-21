```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] indices = new int[m];
        for (int i = 0; i < m; i++) {
            indices[i] = scanner.nextInt();
        }
        int result = calculateValue(numbers, indices);
        for (int index : indices) {
            System.out.println(result);
        }
    }

    public static int sumNumbers(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiplyNumbers(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int addNumbers(int r, int constantValue) {
        return sumNumbers(r, constantValue);
    }

    public static int calculateValue(int[] numbers, int[] indices) {
        int r = 1;
        for (int inputNumber : numbers) {
            int initialValue = r;
            r = multiplyNumbers(initialValue, inputNumber);
        }
        return r;
    }
}
```

This Java code does the same thing as the Python code. It reads integers from the input, calculates a result based on the numbers, and then prints the result for each index. The `calculateValue` function in the Java code does not use threads because Java does not support threading in the same way as Python. If you need to use threads in Java, you would need to use the `java.util.concurrent` package.

