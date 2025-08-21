```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", " "));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextLine()` method reads a line of text. Then we use the `replace()` method to replace all commas in the input string with spaces. The result is printed to the console.

