```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
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
```

This Java code does the same thing as the Python code you provided. It reads two integers from the standard input, and then checks if the first integer is positive, zero, or negative. If the sum of the two integers is even, it prints "Negative". Otherwise, it prints "Positive".

