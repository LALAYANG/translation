```java
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = L(x, y);
        int result = b / lcm - (a - 1) / lcm;
        System.out.println(result);
    }

    public static int L(int x, int y) {
        int gcd = G(x, y);
        return x * y / gcd;
    }

    public static int G(int a, int b) {
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
```

Explanation:

The code first reads the input from the user and splits it into four integers `x`, `y`, `a`, and `b`.

The `L` function calculates the least common multiple (LCM) of two integers `x` and `y`. It first calculates the greatest common divisor (GCD) of `x` and `y` using the `G` function, and then divides `x` and `y` by the GCD to get the LCM.

The `G` function calculates the GCD of two integers `a` and `b` using the Euclidean algorithm. It repeatedly divides `a` by `b` and swaps `a` and `b` until `a` is divisible by `b`. The final value of `b` is the GCD of `a` and `b`.

The `main` function calculates the result by first calculating the LCM of `x` and `y`, and then subtracting the result from `b` and dividing it by the LCM.

The code then prints the result to the console.

Note: The code assumes that the input is valid and that the integers are positive.
