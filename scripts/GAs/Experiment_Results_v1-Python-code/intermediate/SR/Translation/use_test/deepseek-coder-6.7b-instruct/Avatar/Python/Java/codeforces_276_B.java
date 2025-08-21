Here is the Java equivalent of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static boolean x = true;
    static Map<Character, Integer> dt = new HashMap<>();
    static int outer_loop_bound = 96;
    static int inner_loop_bound = 95;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        countChars(0, outer_loop_bound / inner_loop_bound, 1, s);
        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && oddCount < 1) {
                oddCount += 1;
            } else if (entry.getValue() % 2 != 0 && oddCount >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }

    public static void countChars(int loopIndexOut, int stop, int step, String s) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        countChars(loopIndexOut + step, stop, step, s);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the occurrences of each character in the string, and then checks if the string can be rearranged to form a palindrome. If it can, it prints "First", if not and the length of the string is even, it prints "Second", and if not and the length of the string is odd, it prints "First".

