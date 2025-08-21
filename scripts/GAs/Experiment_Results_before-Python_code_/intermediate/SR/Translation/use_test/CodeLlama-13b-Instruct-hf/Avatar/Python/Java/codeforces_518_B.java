
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int yay = 0;
        int whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.indexOf(c) != -1) {
                yay++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (s.indexOf(c) != -1) {
                whoops++;
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a `for` loop to iterate over the characters in the two strings. For each character in the first string, it checks if it is also present in the second string, and if so, it increments the `yay` variable. For each character in the second string, it checks if it is also present in the first string, and if so, it increments the `whoops` variable. Finally, it prints the values of `yay` and `whoops` separated by a space.

Note that this code assumes that the input strings are not empty, and that they only contain lowercase and uppercase letters. If the input strings can contain other characters, you may need to modify the code accordingly.
