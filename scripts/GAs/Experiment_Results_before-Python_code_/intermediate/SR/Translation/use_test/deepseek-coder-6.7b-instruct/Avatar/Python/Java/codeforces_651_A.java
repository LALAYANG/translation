Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the result as per the given logic, and prints the result.

Please note that in Java, the ternary operator (?:) is used to replace the Python's `if else` statement. It's a shorthand way to write an if-else condition.

Also, in Java, we use `System.out.println` to print the output and `Scanner` class to read the input from the user.

