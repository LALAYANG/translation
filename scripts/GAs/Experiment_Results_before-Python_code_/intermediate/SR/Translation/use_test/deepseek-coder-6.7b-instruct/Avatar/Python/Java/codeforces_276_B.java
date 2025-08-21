Here is the Java version of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int value : map.values()) {
            if (value % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                break;
            }
        }
        if (oddCount <= 1 && s.length() % 2 == 0) {
            System.out.println("First");
        } else if (oddCount > 1 && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (oddCount > 1 && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```

This Java code does the same thing as the Python code. It counts the frequency of each character in the input string and checks if there are more than one characters with an odd count. If there is only one such character and the length of the string is even, it prints "First". If there are more than one such characters and the length of the string is even, it prints "Second". If there are more than one such characters and the length of the string is odd, it prints "First".

