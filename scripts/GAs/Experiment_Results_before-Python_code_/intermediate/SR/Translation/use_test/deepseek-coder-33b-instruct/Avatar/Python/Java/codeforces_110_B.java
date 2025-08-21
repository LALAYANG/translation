```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(LUCKY.charAt(i % 4));
        }
        System.out.println(s.toString());
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an integer from the standard input, then creates a string by repeating the characters in the string "abcd" until the length of the string is equal to the input integer. The resulting string is then printed to the standard output.

