Here is the Java version of the given Python code:

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

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if the first integer is less than 1 and if the second integer is less than 1, and prints the result. If the first integer is not less than 1 and the second integer is not less than 1, it calculates the minimum and maximum values based on the conditions and prints them.

