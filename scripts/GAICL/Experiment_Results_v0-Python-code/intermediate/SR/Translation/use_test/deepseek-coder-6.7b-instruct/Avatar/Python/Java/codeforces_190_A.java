Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_a = 132;
        int condition_b = 668;

        if (condition_a != 0 && condition_b != 0) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }

            int min, max;
            if (m > n) {
                min = m;
                max = n + m - 1;
            } else {
                min = n;
                max = n + m - 1;
                if (m == 0) {
                    max = n;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then it checks if the first integer is less than 1 and the second integer is less than 1. If so, it prints the two integers and exits. If not, it checks if the second integer is greater than the first one. If so, it sets the minimum to the second integer and the maximum to the sum of the first and second integers minus 1. If not, it sets the minimum to the first integer and the maximum to the sum of the first and second integers minus 1. If the second integer is 0, it sets the maximum to the first integer. Finally, it prints the minimum and maximum.

