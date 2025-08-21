Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        outer_loop(0, outer_loop_limit / divisor, 1, common_ratio, principal, x);
    }

    public static void outer_loop(int LoopIndexOut, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        inner_loop(2, 12, 1, common_ratio, principal, x);
        outer_loop(LoopIndexOut + step, stop, step, common_ratio, principal, x);
    }

    public static void inner_loop(int i, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
        inner_loop(i + step, stop, step, common_ratio, principal, x);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, and then it prints a series of numbers calculated using the given formula. The formula is the same as in your Python code. The only difference is that the Python `**` operator is replaced with `Math.pow()` in Java.

