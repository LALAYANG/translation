```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `t` from the input, and then for each of the next `t` integers, it computes and prints the result of the `solve` function. The `solve` function computes a number based on the input `n`, and the logic of the function is similar to the Python code.

