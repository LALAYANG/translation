Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        for (char z : txt.toCharArray()) {
            if (Character.isLowerCase(z)) {
                cl++;
            } else {
                cu++;
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of uppercase and lowercase characters, and then converts the entire string to either uppercase or lowercase, depending on which one has more characters.

