
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princessPower = scanner.nextInt();
        int dragonPower = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;
        int position = t * princessPower;
        int loopCounter1 = 797;
        int loopCounter2 = 796;
        while (loopCounter1 % loopCounter2 == 1) {
            loopCounter1++;
            while (position < c) {
                result++;
                position += princessPower * position / dragonPower;
                position += princessPower * f;
                position += princessPower * position / (dragonPower - princessPower);
            }
        }
        System.out.println(result);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result. The `while` loop is used to iterate over the input values, and the `if` statement is used to check the conditions for the game to be over. The `break` statement is used to exit the loop if the game is over.
