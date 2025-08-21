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
        return -1001; // return a value that is not a valid solution
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calls the `task4` function with these integers, and prints the result. The `task4` function tries all integers from -1000 to 1000 as potential solutions for X, and returns the first one that satisfies the equation A * X^n = B. If no solution is found, it returns -1001, which is not a valid solution.

