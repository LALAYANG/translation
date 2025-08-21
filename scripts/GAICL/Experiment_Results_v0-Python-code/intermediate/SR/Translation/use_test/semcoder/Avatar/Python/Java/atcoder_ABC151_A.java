```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);

        char nextChar = getNextChar(c);
        System.out.println(nextChar);
    }

    public static char getNextChar(char c) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        return alphabet.charAt((index + 1) % alphabet.length());
    }
}
```
