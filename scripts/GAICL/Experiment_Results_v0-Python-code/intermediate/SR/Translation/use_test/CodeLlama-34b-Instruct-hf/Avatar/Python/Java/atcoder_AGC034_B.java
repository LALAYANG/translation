
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
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
        int total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (int i = 0; i < t.length(); i++) {
            if (CHECK_CONDITION_1 & CHECK_CONDITION_2) {
                if (t.charAt(i) == 'X') {
                    numA = 0;
                } else if (t.charAt(i) == 'A') {
                    numA++;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
    }
}
```
Note that I've removed the `Func_gcd_0` function as it doesn't seem to be used in the code you provided. Also, I've replaced the `input()` function with `scanner.nextLine()` to read input from the user.

The Java code should produce the same output as the Python code for the given input.
