Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder my_str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str.append(c);
            } else if (c == 'B' && my_str.length() != 0) {
                my_str.setLength(my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. If the character is '0' or '1', it appends it to `my_str`. If the character is 'B' and `my_str` is not empty, it removes the last character from `my_str`. Finally, it prints `my_str`.

