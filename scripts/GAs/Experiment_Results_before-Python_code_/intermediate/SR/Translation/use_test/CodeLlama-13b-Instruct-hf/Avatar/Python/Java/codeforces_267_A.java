
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lst[i] = subtract(a, b);
        }
        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static int subtract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        } else if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `subtract()` method is implemented in a similar way as the Python code, with the only difference being that Java does not have a built-in `map()` function, so we have to use a `for` loop to iterate over the input.
