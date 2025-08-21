Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.put(s.charAt(i), even.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                odd.put(s.charAt(i), odd.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int min = Math.min(s.length() - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0)),
                s.length() - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0)));
        System.out.println(min);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then it counts the number of '0's and '1's at even and odd indices separately. It then calculates the minimum of two possible results: the number of characters that need to be changed to make the string alternating or the number of characters that need to be changed to make the string non-alternating. The result is printed to the standard output.

