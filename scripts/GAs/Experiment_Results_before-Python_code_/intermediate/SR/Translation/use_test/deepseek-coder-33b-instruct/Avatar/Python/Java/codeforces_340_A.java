```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long a = Long.parseLong(input[2]);
        long b = Long.parseLong(input[3]);

        long lcm = L(x, y);
        System.out.println((b / lcm) - ((a - 1) / lcm));
    }

    public static long G(long a, long b) {
        while (a % b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static long L(long a, long b) {
        return (a * b) / G(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the least common multiple (LCM) of the first two numbers, and then calculates the number of multiples of the LCM that are in the range from a to b (inclusive). The LCM is calculated using the G function, which calculates the greatest common divisor (GCD) of two numbers. The L function calculates the LCM of two numbers by multiplying them and dividing by their GCD.

