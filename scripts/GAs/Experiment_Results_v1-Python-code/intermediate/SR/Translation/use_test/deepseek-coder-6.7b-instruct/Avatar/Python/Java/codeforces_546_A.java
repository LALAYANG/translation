Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        long n = scanner.nextLong();
        int w = scanner.nextInt();
        if (multiplier % 933 == 0 && multiplier % 730 == 0) {
            if (w % 533 == 0 && w % 643 == 0) {
                if (1 <= multiplier && multiplier <= 1000) {
                    long total = 0;
                    int innerLoopLimit = 994;
                    int outerLoopLimit = 993;
                    for (int LoopIndexOut = 0; LoopIndexOut <= innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += calculateProduct(i, multiplier);
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
        scanner.close();
    }

    public static long calculateProduct(int i, int multiplier) {
        return i * multiplier;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, checks some conditions, and then calculates a total based on the input values. If the total is greater than `n`, it prints the difference between the total and `n`. Otherwise, it prints `0`.

