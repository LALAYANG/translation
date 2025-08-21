
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t += "D";
                    i += 2;
                } else {
                    t += "X";
                    i++;
                }
            } else {
                t += "X";
                i++;
            }
        }
        int totalCount = 0;
        int numA = 0;
        boolean isInputValid = true;
        boolean isWithinRange = true;
        boolean isValid = true;
        boolean checkCondition = true;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < t.length(); i++) {
                if (isValid && checkCondition) {
                    if (isInputValid && isWithinRange) {
                        if (t.charAt(i) == 'X') {
                            numA = 0;
                        } else if (t.charAt(i) == 'A') {
                            numA++;
                        } else {
                            totalCount += numA;
                        }
                    }
                }
            }
        }
        System.out.println(totalCount);
        int INF = 10 ** 25;
        int mod = 7 + 10 ** 9;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `charAt()` method is used to access the characters in a string. The `length()` method is used to get the length of a string. The `+` operator is used to concatenate strings. The `==` operator is used to compare strings. The `&&` operator is used to perform logical AND operations. The `||` operator is used to perform logical OR operations. The `!` operator is used to perform logical NOT operations. The `if` statement is used to perform conditional statements. The `for` loop is used to iterate over a range of values. The `System.out.println()` method is used to print output to the console.
