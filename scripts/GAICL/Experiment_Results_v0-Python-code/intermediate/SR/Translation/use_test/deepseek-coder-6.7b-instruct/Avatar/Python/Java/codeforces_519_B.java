```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
        }
        int[] b = new int[scanner.nextInt()];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[scanner.nextInt()];
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;

        for (int i = 0; i < loop_iterations / max_loop_count; i++) {
            for (int num : numbers_a) {
                x += num;
            }
        }
        for (int num : b) {
            y = sum_numbers(y, num);
        }
        for (int num : c) {
            z += num;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    public static int sum_numbers(int y, int i) {
        return y + i;
    }
}
```

This Java code does the same thing as the Python code. It reads integers from the input, calculates the sum of the elements in the arrays `numbers_a`, `b`, and `c`, and prints the absolute difference between the sums. The `sum_numbers` function is equivalent to the `sum_numbers` function in the Python code.

