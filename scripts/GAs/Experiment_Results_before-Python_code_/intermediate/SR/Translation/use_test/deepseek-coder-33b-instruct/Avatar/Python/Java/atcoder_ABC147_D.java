```java
import java.util.*;

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

This Java code does the same thing as the Python code. It reads an integer N and an array of N long integers from the standard input. It then calculates the result by iterating over each bit position (from 0 to 59) and for each bit position, it counts the number of 1s and 0s in the array. The result is updated by adding the product of the count of 1s and 0s, the number of elements in the array, and the current bit position (shifted left by the current bit position). The result is then modulo 1000000007 to keep it within the range of a 32-bit integer. The final result is printed to the standard output.

