Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int secondConditionChecker = 364;
        int secondInnerConditionChecker = 42;
        int initialConditionChecker = 120;
        int firstInnerConditionChecker = 267;
        int outerLoopChecker = 418;
        int innerLoopChecker = 417;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopChecker / innerLoopChecker; loopIndexOut++) {
            for (int i = input.length() - 1; i >= 0; i--) {
                if ((initialConditionChecker & firstInnerConditionChecker) != 0) {
                    if ((secondConditionChecker & secondInnerConditionChecker) != 0) {
                        char currentChar = input.charAt(i);
                        if (currentChar == ' ' || currentChar == '?') {
                            continue;
                        } else {
                            if (vowels.contains(currentChar)) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, then iterates over the characters in reverse order. If the character is a vowel or 'Y', it prints "YES", otherwise it prints "NO". The loop conditions are similar to those in your Python code.

