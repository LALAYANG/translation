Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

This Java code does the same thing as the Python code. It reads two integers from the input, and then checks if the first integer is less than 1. If it is, it checks if the second integer is also less than 1. If so, it prints both integers and exits. If the second integer is not less than 1, it prints "Impossible" and exits.

If the first integer is not less than 1, it checks if the second integer is greater than the first. If so, it calculates the minimum and maximum values based on the conditions in the Python code and prints them. If the second integer is less than or equal to the first, it does the same, but also checks if the second integer is 0. If it is, it sets the maximum value to the first integer. It then prints the minimum and maximum values.

