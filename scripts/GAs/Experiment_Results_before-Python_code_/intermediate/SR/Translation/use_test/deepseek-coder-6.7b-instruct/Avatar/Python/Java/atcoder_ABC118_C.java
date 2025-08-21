Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int gcd = findGCD(A, N);
        System.out.println(gcd);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);

            if(result == 1) {
               return 1;
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and N integers from the input, and then calculates the greatest common divisor (GCD) of these integers using the `findGCD` function. The `gcd` function is used to calculate the GCD of two integers.

The `findGCD` function iteratively calculates the GCD of each pair of integers in the array, starting from the first integer. If at any point the GCD is 1, the function immediately returns 1. This is because the GCD of any integer and 1 is 1, and we can't get a GCD of 1 by reducing the array further.

The `main` function reads the input, calls `findGCD` to calculate the GCD, and then prints the result.

