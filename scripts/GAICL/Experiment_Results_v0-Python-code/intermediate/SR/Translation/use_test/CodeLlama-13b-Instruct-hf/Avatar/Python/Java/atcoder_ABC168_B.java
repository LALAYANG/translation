
Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.nextLine();
        if (inputString.length() <= maxLength) {
            System.out.println(inputString);
        } else {
            System.out.println(inputString.substring(0, maxLength) + "...");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `substring` method to truncate the input string if it is longer than the maximum length specified by the user.

Note that the Python code uses the `input` function to read input from the user, which returns a string. In Java, we use the `Scanner` class to read input from the user, and the `nextInt` method to read an integer. The `nextLine` method is used to read a string from the user.
