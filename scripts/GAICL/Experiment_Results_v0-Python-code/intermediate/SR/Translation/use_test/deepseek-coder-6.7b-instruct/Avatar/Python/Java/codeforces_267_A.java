Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(Func_substract_0(a, b));
        }
    }

    private static long Func_substract_0(long a, long b) {
        if (a > b) {
            long total = 0;
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
            long total = 0;
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

This Java code does the same thing as your Python code. It reads an integer `n` from the input, and then reads `n` pairs of long integers from the input. For each pair, it calls the `Func_substract_0` method and prints the result. The `Func_substract_0` method performs the same calculations as your Python code.

