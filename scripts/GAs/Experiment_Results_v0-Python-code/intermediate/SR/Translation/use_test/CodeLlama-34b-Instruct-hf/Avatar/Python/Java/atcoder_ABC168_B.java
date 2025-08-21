```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.next();
        if (inputString.length() <= maxLength) {
            System.out.println(inputString);
        } else {
            System.out.println(inputString.substring(0, maxLength) + "...");
        }
    }
}
```
Note: In Java, the `input()` method is not available in the `Scanner` class, so we need to use `nextInt()` and `next()` methods to read the input from the user. Also, the `concat_strings()` method is not needed in Java, as we can use the `+` operator to concatenate strings.
