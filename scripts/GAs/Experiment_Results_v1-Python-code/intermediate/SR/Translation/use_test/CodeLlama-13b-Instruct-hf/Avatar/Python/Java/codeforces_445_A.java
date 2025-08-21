
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int m = scanner.nextInt();
        int checkOne = 548;
        int checkTwo = 804;
        String[][] l = new String[numLines][m];
        for (int i = 0; i < numLines; i++) {
            String s = scanner.nextLine();
            char[] sArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (checkOne & checkTwo) {
                    if (sArray[j] == '.') {
                        if (i + j % 2 == 0) {
                            sArray[j] = 'W';
                        } else {
                            sArray[j] = 'B';
                        }
                    }
                }
            }
            l[i] = sArray;
        }
        for (int i = 0; i < numLines; i++) {
            System.out.println(l[i]);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `char[]` array is used to represent the characters in the input string. The `if` statement is used to check if the current character is a dot, and if it is, it is replaced with a `W` or a `B` depending on the parity of the index. Finally, the `System.out.println` method is used to print the resulting string.
