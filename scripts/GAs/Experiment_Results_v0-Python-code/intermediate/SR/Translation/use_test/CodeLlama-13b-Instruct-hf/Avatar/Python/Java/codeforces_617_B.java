
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read the input string from the console, and then it uses a `for` loop to count the number of '1' characters in the string. Finally, it prints the count to the console.

Note that this code assumes that the input string is a single line of text, and that it does not contain any whitespace characters. If the input string can contain whitespace characters, you will need to modify the code accordingly.
