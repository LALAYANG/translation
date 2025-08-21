```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = sc.nextInt();
        }

        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        left[0] = 0;
        right[0] = 0;

        for (int i = 1; i <= n; i++) {
            left[i] = gcd(left[i - 1], num_a[i - 1]);
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], num_a[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, gcd(left[i], right[i + 1]));
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
The above code is a Java implementation of the given Python code. It uses the `gcd` function to calculate the greatest common divisor of two numbers, and the `Math.max` function to find the maximum of two numbers. The `gcd` function is defined recursively, and the `Math.max` function is used to find the maximum of the `gcd` values for each pair of adjacent elements in the input array.

The code also uses a `Scanner` object to read input from the user, and a `for` loop to iterate over the input array.

Note that the `gcd` function in the Java code is defined as a static method, which means that it can be called without creating an instance of the `GCD` class. This is because the `gcd` function does not depend on any instance variables or methods of the `GCD` class.
