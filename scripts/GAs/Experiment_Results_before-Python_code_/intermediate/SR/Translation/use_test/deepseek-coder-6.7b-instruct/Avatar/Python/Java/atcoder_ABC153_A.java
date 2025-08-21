Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho += 1;
        }
        System.out.println(sho);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the integer division and modulus, and then prints the result. If the modulus is not zero, it increments the integer division by one before printing.

