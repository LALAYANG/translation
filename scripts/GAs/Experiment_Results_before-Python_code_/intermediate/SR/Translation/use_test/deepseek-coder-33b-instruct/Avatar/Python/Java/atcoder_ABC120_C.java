```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int min = Collections.min(map.values());
        System.out.println(min * 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the frequency of each character in the string, and then prints the double of the minimum frequency. If all characters in the string are the same, it prints 0.

