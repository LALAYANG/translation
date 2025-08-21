Thought Process:
1. Understand the provided code snippet and the function calls made.
2. Identify the key variables and their values.
3. Translate the code snippet into a Java program that accomplishes the same task.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        int result = (int) (a * b * 100 + 0.1);
        System.out.println(result / 100);
    }
}
```

This solution reads two integers `a` and `b` from the input, calculates the product of `a` and `b` with precision up to two decimal places, and then prints the result without the decimal part.
