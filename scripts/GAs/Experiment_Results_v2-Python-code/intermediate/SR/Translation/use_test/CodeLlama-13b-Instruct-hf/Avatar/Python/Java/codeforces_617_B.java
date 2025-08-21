
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count == 0 ? 0 : count);
    }
}
```
This code uses the `Scanner` class to read the input string from the console, and then it iterates over the characters in the string and counts the number of '1' characters. Finally, it prints the result.

Note that the `Scanner` class is used to read the input string from the console, and the `String` class is used to manipulate the input string. The `charAt()` method is used to access the characters in the string, and the `length()` method is used to get the length of the string. The `for` loop is used to iterate over the characters in the string, and the `if` statement is used to check if the current character is a '1' character.
