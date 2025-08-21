```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(lcm(360, x));
    }

    // Function to calculate gcd
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to calculate lcm
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, calculates the least common multiple (lcm) of 360 and the input integer using the gcd function, and then prints the lcm. The gcd function is a common function to calculate the greatest common divisor of two integers. The lcm is calculated by dividing the product of the two numbers by their gcd.

