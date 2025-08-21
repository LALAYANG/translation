```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int gcd = gcd(360, x);
        System.out.println(360 / gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
Note: In Java, the `gcd` method is not available in the `Math` class, so we need to define it ourselves. The `gcd` method calculates the greatest common divisor of two integers using the Euclidean algorithm.
