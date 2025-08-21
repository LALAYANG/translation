Thought process:
1. Understand the provided code snippet and the function `sum_numbers`.
2. Implement the missing parts of the code snippet to make it runnable in Java.
3. Ensure correctness and efficiency of the solution.

```java
import java.util.Scanner;

public class Main {
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

        for (int i = 0; i < numbers_a.length; i++) {
            x += numbers_a[i];
        }
        for (int i = 0; i < b.length; i++) {
            y += b[i];
        }
        for (int i = 0; i < c.length; i++) {
            z += c[i];
        }
        System.out.println(Math.abs(x - y));
        // ttest_ind([21, 54, 7], [62, 25, 100])
        System.out.println(Math.abs(y - z));
    }
}
```

This solution provides a Java implementation of the given code snippet, ensuring correctness and efficiency in calculating the required outputs.
