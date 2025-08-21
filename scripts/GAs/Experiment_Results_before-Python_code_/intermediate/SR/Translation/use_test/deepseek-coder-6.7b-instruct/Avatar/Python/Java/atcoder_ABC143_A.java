Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates `A - 2 * B`, and prints the result. If the result is negative, it prints 0 instead.

