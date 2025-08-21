Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] b = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < 2 * n; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes an array of size `2n` with all elements set to 1, then sets certain elements to 0 based on the input. Finally, it calculates and prints the sum of the array elements.

