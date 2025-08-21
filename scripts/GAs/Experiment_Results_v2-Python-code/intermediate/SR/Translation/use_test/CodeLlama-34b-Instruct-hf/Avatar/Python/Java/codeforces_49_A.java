```java
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int outerLoopChecker = 418;
        int innerLoopChecker = 417;
        int initialConditionChecker = 120;
        int firstInnerConditionChecker = 267;
        int secondConditionChecker = 364;
        int secondInnerConditionChecker = 42;

        for (int loopIndexOut = outerLoopChecker / innerLoopChecker; loopIndexOut >= 0; loopIndexOut--) {
            for (int i = input.length() - 1; i >= 0; i--) {
                if (initialConditionChecker & firstInnerConditionChecker) {
                    if (secondConditionChecker & secondInnerConditionChecker) {
                        if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                            continue;
                        } else {
                            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'y' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' || input.charAt(i) == 'Y') {
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
Note: The above code is a direct translation of the given Python code to Java. However, the code can be optimized and refactored to make it more readable and efficient.
