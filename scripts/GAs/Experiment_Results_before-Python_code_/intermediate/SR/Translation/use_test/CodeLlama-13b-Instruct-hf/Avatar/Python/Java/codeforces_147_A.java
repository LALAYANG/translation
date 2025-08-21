```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        char[] punctuation = {',', '.', '!', '?'};

        for (int i = 0; i < input.length(); i++) {
            if (i >= 1) {
                if (input.charAt(i) == ' ') {
                    if (output.charAt(output.length() - 1) != ' ') {
                        output += input.charAt(i);
                    } else {
                        continue;
                    }
                } else {
                    if (input.charAt(i) == punctuation[0] || input.charAt(i) == punctuation[1] || input.charAt(i) == punctuation[2] || input.charAt(i) == punctuation[3]) {
                        if (output.charAt(output.length() - 1) == ' ') {
                            output = output.substring(0, output.length() - 1);
                        }
                        output += input.charAt(i);
                        output += " ";
                    } else {
                        output += input.charAt(i);
                    }
                }
            } else {
                if (input.charAt(i) == ' ') {
                    continue;
                }
                if (input.charAt(i) == punctuation[0] || input.charAt(i) == punctuation[1] || input.charAt(i) == punctuation[2] || input.charAt(i) == punctuation[3]) {
                    continue;
                } else {
                    output += input.charAt(i);
                }
            }
        }

        System.out.println(output);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then it iterates over each character in the input string using a `for` loop.

Inside the loop, it checks if the current character is a space, and if it is, it checks if the previous character was also a space. If it was, it skips the current character. If it wasn't, it adds the current character to the output string.

If the current character is not a space, it checks if it is a punctuation mark. If it is, it adds the punctuation mark to the output string, followed by a space. If it isn't, it adds the current character to the output string.

Finally, it prints the output string to the console.
