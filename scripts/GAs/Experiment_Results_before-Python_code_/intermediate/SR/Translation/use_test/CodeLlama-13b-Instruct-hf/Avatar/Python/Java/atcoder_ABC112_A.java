```java
import java.util.Scanner;

public class HelloWorld {

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
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print output to the console.
