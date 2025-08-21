Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((value_1 / z + 1) * z);
    }
}
```

This Java program reads two integers from the standard input, calculates the result as `(value_1 // z + 1) * z`, and prints the result. The `//` operator in Java is the integer division operator, which performs division and returns the largest integer less than or equal to the result.

Please note that in Java, the `//` operator behaves differently than in Python. In Python, `//` is the floor division operator, which rounds the result down to the nearest whole number. In Java, `/` is the regular division operator, which returns a floating-point result. If you want the same behavior as in Python, you should use `Math.floorDiv(value_1, z)` instead of `value_1 / z`.

