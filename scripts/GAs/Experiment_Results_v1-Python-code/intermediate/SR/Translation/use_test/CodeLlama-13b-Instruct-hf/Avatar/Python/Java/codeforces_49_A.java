
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] vo = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int firstConditionalChecker = 327;
        int secondConditionalChecker = 929;
        int innerConditionalCheckerOne = 104;
        int innerConditionalCheckerTwo = 947;
        int outerLoopCounter = 582;
        int innerLoopCounter = 581;

        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            for (int j = input.length() - 1; j >= 0; j--) {
                if (innerConditionalCheckerOne & secondConditionalChecker) {
                    if (firstConditionalChecker & innerConditionalCheckerTwo) {
                        if (input.charAt(j) == ' ' || input.charAt(j) == '?') {
                            continue;
                        } else {
                            if (vo.contains(input.charAt(j))) {
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `contains` method is used to check if a string contains a specific character. The `charAt` method is used to access the characters in a string. The `length` method is used to get the length of a string. The `println` method is used to print output to the console.
