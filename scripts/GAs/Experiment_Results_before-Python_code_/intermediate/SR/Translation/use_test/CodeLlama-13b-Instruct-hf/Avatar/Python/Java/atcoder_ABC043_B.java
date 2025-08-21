```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String myStr = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c == 'B' && myStr.length() != 0) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then iterates over each character in the input string using a `for` loop. If the character is a `0` or a `1`, it is added to the `myStr` string. If the character is a `B` and the `myStr` string is not empty, it is removed from the end of the `myStr` string. Finally, the `myStr` string is printed to the console.
