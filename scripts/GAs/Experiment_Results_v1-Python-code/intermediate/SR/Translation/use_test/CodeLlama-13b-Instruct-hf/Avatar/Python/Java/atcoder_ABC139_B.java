
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int counter = 0;
        boolean check = true;
        while (check) {
            int bitmaskA = 63;
            int operandC = 643;
            int operandA = 598;
            int operandB = 943;
            int bitmaskC = 368;
            int operandD = 383;
            if ((bitmaskA & operandC) != 0) {
                if ((operandA & operandB) != 0) {
                    if ((bitmaskC & operandD) != 0) {
                        if (hole >= b) {
                            check = false;
                        } else {
                            hole = a * (counter + 1) - counter;
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if` statements are written using the bitwise AND operator (`&`) to check if the bitmasks are set. The `while` loop continues until the `check` variable is set to `false`.
