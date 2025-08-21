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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the maximum of `x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0)` and 0, and prints the result.

