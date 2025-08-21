Here is the Java version of the Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's 1, and if it is, it prints "Hello World". If it's not 1, it reads two more integers from the user and prints their sum.

