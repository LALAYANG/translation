```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = (1 + n) * n / 2;
            int t = 1;
            while (t <= n) {
                s -= 2 * t;
                t *= 2;
            }
            System.out.println(s);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output.

The `main()` method first reads the value of `t` from the user using the `Scanner` class. It then uses a `for` loop to iterate `t` times, reading the value of `n` from the user each time.

For each value of `n`, the code calculates the value of `s` using the formula `(1 + n) * n / 2`. It then uses a `while` loop to calculate the value of `t` and subtracts `2 * t` from `s` until `t` is greater than or equal to `n`.

Finally, the code prints the value of `s` using the `System.out.println()` method.

I hope this helps! Let me know if you have any questions.
