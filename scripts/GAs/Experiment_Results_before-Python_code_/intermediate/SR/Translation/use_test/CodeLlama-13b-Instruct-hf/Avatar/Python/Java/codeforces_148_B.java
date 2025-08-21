```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if (dragon <= princess) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);

        while (position < c) {
            result += 1;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }

        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if` statement checks if the dragon's health is less than or equal to the princess's health, and if it is, it prints 0 and exits the program. If the dragon's health is greater than the princess's health, the code calculates the number of times the princess needs to attack the dragon to defeat it, and prints the result.
