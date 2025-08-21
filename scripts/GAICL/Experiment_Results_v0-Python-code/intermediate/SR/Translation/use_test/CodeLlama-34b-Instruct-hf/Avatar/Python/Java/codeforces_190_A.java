```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionA = 132;
        int conditionB = 668;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (conditionA & conditionB) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        }

        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

Explanation:

The program takes two integers as input, `n` and `m`. It then checks if the conditions `conditionA` and `conditionB` are both true. If they are, it checks if `n` is less than 1 and `m` is less than 1. If both are true, it prints `n` and `m` and exits the program. If `m` is less than 1, it prints "Impossible" and exits the program.

If `m` is greater than `n`, it sets `min` to `m` and `max` to `n + m - 1`. If `m` is less than or equal to `n`, it sets `min` to `n` and `max` to `n + m - 1`. If `m` is equal to 0, it sets `max` to `n`. Finally, it prints `min` and `max`.

The program uses the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the user. The `System.out.println()` method is used to print output to the user.
