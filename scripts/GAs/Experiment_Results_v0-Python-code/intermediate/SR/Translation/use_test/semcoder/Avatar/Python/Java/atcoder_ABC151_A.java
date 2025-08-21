Thought process:
1. Understand the provided code snippet and its functionality.
2. Translate the code snippet into Java code.
3. Ensure the translated code runs without errors and produces the expected output.

```java
// Translated code snippet
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        char result = alphabet.charAt((index + 1) % alphabet.length());

        System.out.println(result);
    }
}
```

This translated code snippet reads input from the console, extracts the first character, finds the next character in the alphabet, and prints the result.
