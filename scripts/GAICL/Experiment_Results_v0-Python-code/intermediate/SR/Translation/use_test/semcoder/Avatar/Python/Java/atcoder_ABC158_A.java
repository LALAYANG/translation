```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        boolean containsA = userInput.contains("A");
        boolean containsB = userInput.contains("B");

        String result = containsA && containsB ? "Yes" : "No";
        System.out.println(result);
    }
}
```

This solution reads user input, checks if both 'A' and 'B' are present in the input string, and then prints 'Yes' if both characters are present, otherwise prints 'No'.
