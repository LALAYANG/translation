
The provided Python code is a bit complex and contains several concepts that are not commonly used in Java programming. However, I can provide a Java implementation of the core logic of the program, which is the encoding of the input message using a specific algorithm.

Here is a possible implementation of the program in Java:
```java
import java.util.Scanner;

public class MessageEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        String encodedMessage = "";
        int i = 0;

        while (i < inputMessage.length()) {
            if (inputMessage.charAt(i) == '.') {
                encodedMessage += "0";
            } else {
                i++;
                if (i < inputMessage.length() && inputMessage.charAt(i) == '.') {
                    encodedMessage += "1";
                } else {
                    encodedMessage += "2";
                }
            }
            i++;
        }

        System.out.println(encodedMessage);
    }
}
```
This implementation uses a `Scanner` object to read the input message from the user, and then it iterates over the characters of the input message using a `for` loop. For each character, it checks if it is a dot (`.`) and if it is, it adds a `0` to the encoded message. If it is not a dot, it increments the index `i` and checks if the next character is a dot. If it is, it adds a `1` to the encoded message. If it is not, it adds a `2` to the encoded message. Finally, it prints the encoded message to the console.

Note that this implementation is a bit different from the original Python code, as it does not use any of the advanced concepts such as threads, queues, or scipy.stats. However, it should produce the same output for the same input.
