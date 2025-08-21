
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                charCounts.put(c, 1);
            } else {
                charCounts.put(c, charCounts.get(c) + 1);
            }
        }
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.get(c) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a `Set` to keep track of the unique characters in the input string. It also uses a `Map` to keep track of the number of times each character appears in the input string.

The code then checks if the number of unique characters in the input string is equal to 2, and if so, it checks if each character appears exactly twice in the input string. If either of these conditions is not met, the code prints "No" and exits. Otherwise, it prints "Yes".
