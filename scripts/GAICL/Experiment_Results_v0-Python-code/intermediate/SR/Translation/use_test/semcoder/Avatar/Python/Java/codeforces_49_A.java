Thought Process:
1. Understand the provided code snippet and its functionality.
2. Translate the code snippet into a Java program that accomplishes the same task.
3. Ensure the translated program runs without errors and produces the expected output.

Solution:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TranslatedCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int condition14 = 816;
        int condition24 = 629;
        int condition16 = 60;
        int condition26 = 325;
        int innerLoopLimit = 958;
        int outerLoopLimit = 957;

        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int reverseIndex = inputString.length() - 1; reverseIndex >= 0; reverseIndex--) {
                if ((condition16 & condition26) != 0) {
                    if ((condition14 & condition24) != 0) {
                        if (inputString.charAt(reverseIndex) == ' ' || inputString.charAt(reverseIndex) == '?') {
                            continue;
                        }
                        if (vowels.contains(inputString.charAt(reverseIndex))) {
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
```

This solution translates the provided Python code snippet into a Java program that performs the same functionality. It reads input from the console, processes the string based on conditions, and prints the output accordingly.
