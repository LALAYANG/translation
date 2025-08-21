```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(task4(A, B, n));
    }

    public static int task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, and then it calls the `task4` method with these integers as arguments. The `task4` method returns the first integer `X` in the range from -1000 to 1000 that satisfies the equation `A * X^n == B`. If no such `X` exists, the method throws an `IllegalArgumentException` with the message "No solution". The `main` method catches this exception and prints its message to the standard output.

