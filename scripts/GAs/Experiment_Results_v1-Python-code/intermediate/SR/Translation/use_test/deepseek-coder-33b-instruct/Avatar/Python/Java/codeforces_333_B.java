The provided Python code uses the scipy library for statistical analysis, which is not available in Java. Therefore, it cannot be directly translated to Java.

However, the logic of the code can be implemented in Java. Here is a rough translation of the code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num_moves = scanner.nextInt();

        int[] b = new int[n * 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        int inner_loop_bound = 895;
        int outer_loop_bound = 894;
        for (int outer_loop_index = 0; outer_loop_index < inner_loop_bound / outer_loop_bound; outer_loop_index++) {
            recursiveFunction(scanner, 0, num_moves, 1, b);
        }

        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }

        int sum = 0;
        for (int i : b) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void recursiveFunction(Scanner scanner, int i, int stop, int step, int[] b) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int r = scanner.nextInt();
        int column = scanner.nextInt();
        b[r - 1] = b[b.length / 2 + column - 1] = 0;
        recursiveFunction(scanner, i + step, stop, step, b);
    }
}
```

Please note that this is a rough translation and may not work as expected due to the lack of the statistical analysis part in the original Python code.

