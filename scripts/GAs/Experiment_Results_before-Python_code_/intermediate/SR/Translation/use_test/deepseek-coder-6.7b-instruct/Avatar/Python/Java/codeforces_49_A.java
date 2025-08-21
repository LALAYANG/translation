Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        List<Character> vo = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (c == ' ' || c == '?') {
                continue;
            } else {
                if (vo.contains(c)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then checks each character from the end of the string. If the character is a space or a question mark, it skips it. If the character is a vowel (either lowercase or uppercase), it prints "YES" and stops. If the character is not a vowel, it prints "NO" and stops.

