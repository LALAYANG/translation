```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int firstCondition = 200;
        int secondCondition = 863;

        if (firstCondition > 0 && secondCondition > 0) {
            if (a > 0) {
                System.out.println("Positive");
            } else if (a <= 0 && b >= 0) {
                System.out.println("Zero");
            } else if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers from the standard input, and then checks the conditions based on these integers. The output is printed to the standard output.

