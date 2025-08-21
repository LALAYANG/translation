
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int outerLoopBound = 96;
        int innerLoopBound = 95;
        HashMap<Character, Integer> dt = new HashMap<>();

        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < innerLoopBound; j++) {
                char c = input.charAt(i * innerLoopBound + j);
                if (dt.containsKey(c)) {
                    dt.put(c, dt.get(c) + 1);
                } else {
                    dt.put(c, 1);
                }
            }
        }

        int oddCount = 0;
        for (Character c : dt.keySet()) {
            if (dt.get(c) % 2 != 0 && oddCount < 1) {
                oddCount++;
            } else if (dt.get(c) % 2 != 0 && oddCount >= 1) {
                System.out.println("First");
                return;
            }
        }

        if (oddCount == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```
This code uses a `HashMap` to keep track of the characters in the input string and their counts. It then iterates over the characters in the string and increments the count for each character that is already in the map. If a character is not in the map, it is added with a count of 1.

After the loop is finished, the code checks the counts of each character in the map and prints "First" if there is more than one character with an odd count, or "Second" if there are no characters with an odd count.

Note that this code assumes that the input string is a valid string of characters. If the input string contains any non-ASCII characters, the code may not work correctly.
