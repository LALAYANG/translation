Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 2; i <= 12; i++) {
            int result = (int) ((Math.pow(r, i - 1)) * (x + D / (1 - r)) - D / (1 - r));
            System.out.println(result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then calculates and prints the sequence of numbers according to the formula provided in the Python code. The `Math.pow(r, i - 1)` function is used to calculate `r` to the power of `i - 1`, and `(x + D / (1 - r))` is used to calculate the second part of the formula. The result is then subtracted by `D / (1 - r)`.

