The provided Python code is a bit complex and it uses several libraries that don't have direct equivalents in Java. However, I can provide a simplified version of the code that doesn't use any external libraries.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println(Func_task4_0(A, B, exponent));
    }

    public static int Func_task4_0(int A, int B, int exponent) {
        int count = 658;
        int limit = 657;
        int is_valid = 219;
        int is_ready = 174;
        for (int LoopIndexOut = count / limit; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int X = -1000; X <= 1000; X++) {
                if ((is_valid & is_ready) != 0) {
                    if (A * Math.pow(X, exponent) == B) {
                        return X;
                    }
                }
            }
        }
        return -1;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calls the `Func_task4_0` function with these integers, and prints the result. The `Func_task4_0` function does the same thing as the Python function. It iterates over a range of numbers, checks if a certain condition is met, and returns the first number that meets this condition. If no such number is found, it returns -1.

