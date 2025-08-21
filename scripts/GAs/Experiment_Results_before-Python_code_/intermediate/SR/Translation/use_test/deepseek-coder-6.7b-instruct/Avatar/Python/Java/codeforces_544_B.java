Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int x = 0;
        if (k <= Math.max(n * n / 2, n * n - (n * n / 2))) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print('L');
                        x++;
                    } else {
                        System.out.print('S');
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if `k` is less than or equal to the maximum of `n^2/2` or `n^2 - n^2/2`, and if it is, it prints a grid of 'L's and 'S's. If `k` is not less than or equal to the maximum, it prints 'NO'.

