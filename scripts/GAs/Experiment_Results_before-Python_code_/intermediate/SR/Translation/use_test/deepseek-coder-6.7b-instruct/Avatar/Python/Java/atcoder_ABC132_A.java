Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String S = "AVVA";
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            set.add(c);
        }
        if (set.size() != 2) {
            System.out.println("No");
            return;
        }
        for (int count : map.values()) {
            if (count != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```

This Java code does the same thing as the Python code. It counts the occurrences of each character in the string and stores them in a HashMap. It also adds each character to a HashSet. If the size of the HashSet is not 2 (meaning there are more than 2 unique characters in the string), it prints "No" and returns. If the count of any character in the HashMap is not 2, it prints "No" and returns. If none of these conditions are met, it prints "Yes".

