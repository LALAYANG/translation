Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        System.out.println(solve(c));
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }
}
```

This Java code does the same thing as the Python code. It reads a character from the standard input, finds the next character in the alphabet, and prints it.

