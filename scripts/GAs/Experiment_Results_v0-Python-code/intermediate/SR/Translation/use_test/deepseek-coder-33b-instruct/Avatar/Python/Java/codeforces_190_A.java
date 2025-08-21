```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_a = 132;
        int condition_b = 668;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((condition_a & condition_b) != 0) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    System.exit(0);
                } else {
                    System.out.println("Impossible");
                    System.exit(0);
                }
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        }
        if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks some conditions, and prints the results. The conditions are the same as in the Python code. The `System.exit(0)` call is used to terminate the program immediately.

