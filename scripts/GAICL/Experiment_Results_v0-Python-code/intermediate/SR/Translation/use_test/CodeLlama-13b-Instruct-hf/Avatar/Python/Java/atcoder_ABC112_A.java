
Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (condition_1 & condition_2) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(input_a + input_b);
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `if` statements are used to check the conditions and print the appropriate message.
