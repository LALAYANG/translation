Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a string `s` from the input, and then it iterates over the string. If the current character is a dot, it adds '0' to the result string. If the current character is not a dot, it skips the next character and adds '1' or '2' to the result string depending on whether the next character is a dot or not. The result string is then printed to the console.

