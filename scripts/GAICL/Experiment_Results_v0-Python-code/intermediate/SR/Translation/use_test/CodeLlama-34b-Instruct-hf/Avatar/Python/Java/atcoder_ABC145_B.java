```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.next();

        if (inputNumber % 2 != 0) {
            System.out.println("No");
        } else if (inputString.substring(0, inputNumber / 2).equals(inputString.substring(inputNumber / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `print()` function to print output, but in Java, we use the `System.out.println()` method to print output.
