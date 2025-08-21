```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int gcd = gcd(360, x);
        System.out.println(360 / gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
Explanation:

* The `gcd` function is defined to calculate the greatest common divisor of two integers.
* The `main` function takes input from the user using the `Scanner` class and stores it in the variable `x`.
* The `gcd` function is called with the arguments `360` and `x` to calculate the greatest common divisor.
* The result of the `gcd` function is then used to calculate the least common multiple of `360` and `x` using the formula `360 / gcd`.
* The result is then printed to the console using the `System.out.println` method.

Note: The `gcd` function is a recursive function, which means it calls itself repeatedly until it reaches a base case. In this case, the base case is when `b` is equal to `0`, in which case the function returns `a`.
