Thought process:
1. Read the input integer `N` and convert the input string to a NumPy array of integers.
2. Initialize `result` to 0 and iterate over each bit position `b` from 0 to 59.
3. Count the number of set bits in the current bit position `bs` using NumPy operations.
4. Update the `result` by adding the contribution of the current bit position.
5. Print the final result after calculating the sum of all bit positions.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
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
