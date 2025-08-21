```
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JavaDecorator {
    public static void main(String[] args) {
        String inputString = "AVVA";
        int checkValue = 274;
        int conditionValue = 956;
        int loopBound = 412;
        int loopStep = 411;

        // Shuffle the input string
        char[] inputChars = inputString.toCharArray();
        Arrays.sort(inputChars);
        String shuffledInputString = new String(inputChars);

        // Get the unique characters in the input string
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : shuffledInputString.toCharArray()) {
            uniqueChars.add(c);
        }

        // Check if the number of unique characters is 2
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }

        // Check if the check value and condition value are both non-zero
        if (checkValue != 0 && conditionValue != 0) {
            // Check if the loop bound and step are both non-zero
            if (loopBound != 0 && loopStep != 0) {
                // Recursively check the input string
                recursiveCheck(0, loopBound / loopStep, 1);
            }
        }

        System.out.println("Yes");
    }

    public static void recursiveCheck(int loopIndexOut, int stop, int step) {
        // Shuffle the input string
        char[] inputChars = shuffledInputString.toCharArray();
        Arrays.sort(inputChars);
        String shuffledInputString = new String(inputChars);

        // Get the unique characters in the input string
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : shuffledInputString.toCharArray()) {
            uniqueChars.add(c);
        }

        // Check if the number of unique characters is 2
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }

        // Check if the loop index is out of bounds
        if (loopIndexOut < 0 || loopIndexOut >= stop) {
            return;
        }

        // Check if the step is non-zero
        if (step != 0) {
            // Recursively check the input string
            recursiveCheck(loopIndexOut + step, stop, step);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Arrays.sort()` method to shuffle the input string, and the `HashSet` class to get the unique characters in the input string. The `recursiveCheck()` method is a recursive function that checks the input string and calls itself recursively if necessary.
