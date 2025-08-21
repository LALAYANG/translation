
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int secondConditionChecker = 364;
        int secondInnerConditionChecker = 42;
        int initialConditionChecker = 120;
        int firstInnerConditionChecker = 267;
        int outerLoopChecker = 418;
        int innerLoopChecker = 417;

        for (int i = outerLoopChecker / innerLoopChecker; i > 0; i--) {
            for (int j = len(input) - 1; j >= 0; j--) {
                if (initialConditionChecker & firstInnerConditionChecker) {
                    if (secondConditionChecker & secondInnerConditionChecker) {
                        if (input.charAt(j) == ' ' || input.charAt(j) == '?') {
                            continue;
                        } else {
                            if (input.charAt(j) in vowels) {
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `charAt()` method to access the characters in the input string. The `len()` function is used to get the length of the input string. The `in` operator is used to check if a character is in a list of characters. The `continue` statement is used to skip the current iteration of the loop if the character is a space or a question mark. The `break` statement is used to exit the loop if the character is a vowel.
