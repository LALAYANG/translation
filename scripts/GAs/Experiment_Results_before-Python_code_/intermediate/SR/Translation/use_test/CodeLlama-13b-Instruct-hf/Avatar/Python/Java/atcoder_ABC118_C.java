```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.BinaryOperator;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int gcd = a.stream().reduce(1, (a, b) -> gcd(a, b));
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
This code uses the `reduce` method of the `Stream` class to calculate the greatest common divisor (GCD) of the elements in the list. The `gcd` method is a recursive function that uses the Euclidean algorithm to calculate the GCD of two numbers. The `gcd` method is called with the initial value of 1, and the `reduce` method is called with the `gcd` method as the accumulator and the `BinaryOperator` that takes two integers and returns their GCD. The resulting GCD is then printed to the console.
