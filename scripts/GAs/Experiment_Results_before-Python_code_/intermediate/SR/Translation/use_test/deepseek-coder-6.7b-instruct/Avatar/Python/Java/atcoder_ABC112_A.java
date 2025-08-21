```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, and if the integer is 1, it prints "Hello World". If the integer is not 1, it reads two more integers from the input and prints their sum.

