Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check_665 = 665;
        int check_537 = 537;
        int check_182 = 182;
        int check_298 = 298;

        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        String input_string = scanner.next();

        if ((check_665 & check_537) != 0) {
            if ((check_182 & check_298) != 0) {
                if (input_number % 2 != 0) {
                    System.out.println("No");
                } else if (input_string.substring(0, input_number / 2).equals(input_string.substring(input_number / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `input()` function to get user input, which is not available in Java. Instead, we use the `Scanner` class to get user input. Also, the Python code uses the `&` operator to perform a bitwise AND operation, which is not available in Java. Instead, we use the `&` operator to perform a logical AND operation.

