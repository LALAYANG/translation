Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < N; i++) {
                bs += (A[i] >> b) & 1;
            }
            result = (result + bs * (N - bs) * (1L << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` and an array `A` of `N` integers from the input. Then it calculates the result as the sum of the products of the counts of bits in each position of the numbers in `A`, modulo `1000000007`. The result is printed to the standard output.

