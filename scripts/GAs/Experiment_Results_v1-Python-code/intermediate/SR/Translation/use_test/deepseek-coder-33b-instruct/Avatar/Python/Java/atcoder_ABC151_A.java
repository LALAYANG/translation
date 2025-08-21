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
        int charIndex = a.indexOf(c);
        return String.valueOf(a.charAt(charIndex + 1));
    }
}
```

Please note that the Java version does not have the debugging functionality and the loop printing functionality from the Python version.

