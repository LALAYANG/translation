Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            long E = k * X + 2 * sum(S, N - 2 * k - 1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static long sum(long[] S, int end, int step) {
        long sum = 0;
        for (int i = end; i >= 0; i += step) {
            sum += S[i];
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the accumulated sum of the array, and then calculates the minimum possible value of the expression E for each possible value of k. The result is printed to the standard output.

The `sum` method is a helper method that calculates the sum of the elements of the array `S` from the given `end` index to 0 with the given `step`.

