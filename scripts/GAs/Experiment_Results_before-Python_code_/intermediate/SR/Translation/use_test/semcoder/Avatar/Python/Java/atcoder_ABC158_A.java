To solve this problem, we need to check if the input string contains both 'A' and 'B' characters. If both characters are present, we print "Yes"; otherwise, we print "No".

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean containsA = input.contains("A");
        boolean containsB = input.contains("B");

        String result = containsA && containsB ? "Yes" : "No";
        System.out.println(result);
    }
}
```

This solution reads the input string from the console, checks if it contains 'A' and 'B' characters, and then prints "Yes" if both characters are present, or "No" otherwise.
