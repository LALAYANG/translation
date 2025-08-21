```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 2; i <= 12; i++) {
            System.out.println((int) (Math.pow(r, i - 1) * (x + D / (1 - r)) - D / (1 - r)));
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of `r` for each iteration. The `System.out.println()` method is used to print the result of each iteration.

Note that the `int` cast is used to convert the result of the calculation to an integer, as the `Math.pow()` method returns a `double` value.
