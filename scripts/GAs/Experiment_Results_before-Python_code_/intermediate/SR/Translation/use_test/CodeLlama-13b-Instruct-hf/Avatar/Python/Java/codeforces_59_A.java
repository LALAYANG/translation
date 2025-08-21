```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else {
                upperCaseCount++;
            }
        }

        String output;
        if (lowerCaseCount > upperCaseCount) {
            output = input.toLowerCase();
        } else {
            output = input.toUpperCase();
        }

        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it iterates over the characters in the input string using a `for` loop. For each character, it checks if it is a lowercase letter or an uppercase letter using the `Character.isLowerCase()` method. If it is a lowercase letter, it increments the `lowerCaseCount` variable, and if it is an uppercase letter, it increments the `upperCaseCount` variable.

After the loop is finished, the code checks which variable has a greater value, and based on that, it decides whether to convert the input string to lowercase or uppercase using the `toLowerCase()` or `toUpperCase()` methods. Finally, it prints the output string to the console.
