
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String myStr = "";
        int conditionThree = 389;
        int conditionFour = 675;
        int conditionOne = 779;
        int conditionTwo = 517;
        int loopBoundOne = 388;
        int loopBoundTwo = 387;
        for (int outerLoopIndex = loopBoundOne / loopBoundTwo; outerLoopIndex > 0; outerLoopIndex--) {
            for (int currentChar = 0; currentChar < s.length(); currentChar++) {
                if ((conditionOne & conditionTwo) != 0) {
                    if ((conditionThree & conditionFour) != 0) {
                        if (s.charAt(currentChar) == '0' || s.charAt(currentChar) == '1') {
                            myStr += s.charAt(currentChar);
                        } else if (s.charAt(currentChar) == 'B' && myStr.length() != 0) {
                            myStr = myStr.substring(0, myStr.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(myStr);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `substring` method is used to remove the last character of the string if the current character is 'B' and the string is not empty.
